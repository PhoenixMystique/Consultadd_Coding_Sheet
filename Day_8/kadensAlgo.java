
class Solution{
    long maxSubarraySum(int arr[], int n){
        int temp =0;
        int largest=Integer.MIN_VALUE;

        for(int i:arr){
            temp=temp+i;
            if(temp>largest){
                largest=temp;
            }
            if(temp<0){
                temp=0;
            }
        }
        return largest;
    }

}