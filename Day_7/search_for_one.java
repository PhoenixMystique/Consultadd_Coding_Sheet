class Sol
{
    public static int search(int a[], int n)
    {
           for(int i:a){
                if(i==n) return 1;
            }
        int element =0;
        for(int i=0;i<n;i++){
            element = element ^ a[i];
        }
        return element;
    }
}