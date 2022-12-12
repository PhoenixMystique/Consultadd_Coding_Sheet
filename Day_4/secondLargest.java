class Solution {

    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        for(int i=n-1;i>=1;i--){
            if(arr[i]>arr[i-1]){
                return arr[i-1];
            }

        }
        return -1;
    }

}