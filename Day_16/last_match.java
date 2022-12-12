//User function Template for Java
class Solution{
    public static void computeLPS(int[] lps,String pat)
    {
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<pat.length())
        {
            if(pat.charAt(i)==pat.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }



    }
    static int findLastOccurence(String A,String B){

        int[] lps=new int[B.length()];

        computeLPS(lps,B);
        int N=A.length();
        int M=B.length();
        int i=0;
        int j=0;
        int index=-1;
        while(N-i>=M-j)
        {
            if(A.charAt(i)==B.charAt(j))
            {
                i++;
                j++;
            }
            if(j==M)
            {
                index=i-j+1;
                j=lps[j-1];
            }
            else if(i<N && A.charAt(i)!=B.charAt(j))
            {
                if(j!=0)
                    j=lps[j-1];
                else
                    i++;
            }
        }

        return index;
    }
}