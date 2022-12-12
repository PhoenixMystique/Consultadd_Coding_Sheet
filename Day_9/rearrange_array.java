
class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        int j=0;
        int k=0;
        int p=pos.size();
        int q=neg.size();
        for(int i=0;i<n;i++)
        {
            if((i%2==0&&p>0)||q==0)
            {
                arr[i]=pos.get(j);
                p--;
                j++;
            }
            else if(q>0)
            {
                arr[i]=neg.get(k);
                q--;
                k++;
            }

        }
    }
}