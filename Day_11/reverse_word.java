class Solution
{

    String reverseWords(String S)
    {String temp="",ans="";
        boolean flag =true;
        boolean flag2 =false;

        for(int i=0;i<S.length();i++){

            if(S.charAt(i)=='.'){
                if(!flag){
                    ans=temp+"."+ans;
                    temp="";
                }
                else{
                    ans=temp+ans;
                    flag=false;
                    if(S.length()-1==i){
                        return temp;
                    }
                    flag2=true;
                    temp="";
                }

                continue;
            }
            temp=temp+S.charAt(i);
        }
        if(!flag2){
            return S;
        }
        ans=temp+"."+ans;
        return ans;
    }
}