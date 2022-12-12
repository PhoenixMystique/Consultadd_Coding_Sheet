class Solution {

    void leftRotate(int[] arr, int n, int d) {

        int f=d;
        if(n==1) f=d-1;
        if(n==0) return;
        if(n==d) f=d%n;
        int[] a=new int[n];



        for(int i=0; i<n;i++){

            a[i]=arr[f];
            f=(f+1)%n;

        }
        for(int i=0; i<n;i++){
            arr[i]=a[i];

        }

        return;

    }

}