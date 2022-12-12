class Solution {

    public static long pairWithMaxSum(long arr[], long N)
    {
        long resSum=Integer.MIN_VALUE;

        for(int i=0;i<N-1;i++){
            long res =arr[i]+arr[i+1];
            if(res>resSum){
                resSum=res;
            }
        }
        return resSum;
    }
}