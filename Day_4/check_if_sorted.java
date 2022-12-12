class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int start = 0;
        int end =arr.length-1 ;

        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }
}