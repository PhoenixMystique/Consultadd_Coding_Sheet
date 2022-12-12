class Solution {
    int isPalindrome(String S) {
        // code here
        int i=S.length()-1;
        for(int j=0;j<S.length()/2;j++){
            if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            i--;
        }
        return 1;
    }
}