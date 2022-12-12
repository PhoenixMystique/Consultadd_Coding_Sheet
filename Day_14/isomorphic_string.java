class Solution
{

    public static boolean areIsomorphic(String str1,String str2)
    {
        HashSet<Character> map = new HashSet();
        HashSet<Character> map2 = new HashSet();
        for(int i=0;i<str1.length();i++){
            map.add(str1.charAt(i));
        }
        for(int j=0;j<str2.length();j++){
            map2.add(str2.charAt(j));
        }

        if(map.size()==map2.size() && map.size()>0 ){
            return true;
        }
        else{
            return false;
        }
    }
}