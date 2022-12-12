class Solution {

    String maxOdd(String s) {
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                String r=s.substring(0,i+1);
                return r;
            }
        }
        return "";
    }
}