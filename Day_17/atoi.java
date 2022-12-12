class Solution
{
    int atoi(String str) {

        int flag=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-')
                flag++;
            if((!Character.isDigit(str.charAt(i)) && str.charAt(i)!='-') || flag>=2)
                return -1;
        }

        return Integer.parseInt(str);
    }

}