class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer>  map = new HashMap();
        for(int i:a){
            map.merge(i, 1, Integer::sum);
            if(map.get(i)>size/2){
                return i;
            }
        }
        return -1;
    }
}