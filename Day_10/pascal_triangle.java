
class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {

        if(n==1) {
            ArrayList<Long> demo = new ArrayList<>();
            demo.add((long) 1);
            return demo;

        }

        ArrayList<Long> faith=nthRowOfPascalTriangle(n-1);
        ArrayList<Long> res = new ArrayList<>();
        res.add(faith.get(0));
        for(int i=0;i<n-2;i++) {
            res.add((faith.get(i)+faith.get(i+1))%1000000007)
        }

        res.add(faith.get(0));
        return res;
    }
}