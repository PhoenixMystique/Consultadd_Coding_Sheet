class Solution
{

    static int findLongestConseqSubseq(int arr[], int N)
    {
        int count=1,longest=1;
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
            }
            else if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count=1;
            }
            if(longest<count){
                longest=count;
            }
        }
        return longest;
    }
}