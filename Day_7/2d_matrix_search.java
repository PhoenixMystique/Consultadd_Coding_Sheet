class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        for(int[] i:mat){
            for(int j:i){
                if(X==j) return 1;
            }
        }
        return 0;
    }
}