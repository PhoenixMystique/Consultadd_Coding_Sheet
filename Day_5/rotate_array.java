class Solution {

    void leftRotate(int[] arr, int n, int d) {

        int temp=d;
        if(n==1) {temp=d-1;}
        if(n==0){ return;}
        if(n==d) {temp=d%n;}
        int[] a=new int[n];

        for(int i=0; i<n;i++){

            a[i]=arr[f];
            temp=(f+1)%n;

        }
        for(int i=0; i<n;i++){
            arr[i]=a[i];

        }
        return;

    }

}