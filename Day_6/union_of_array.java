
class Solution

{

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)

    {
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0; i<n; i++)

        {

            h1.add(arr1[i]);



        }

        for(int j=0; j<m; j++)

        {
            h1.add(arr2[j]);

        }

        ArrayList<Integer> a1= new ArrayList<>();
        a1.addAll(h1);
        Collections.sort(a1);

        return a1;



    }

}



