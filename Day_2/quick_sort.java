class Solution

{

    static void quickSort(int arr[], int low, int high)

    {

        if(low>=high){
            return;
        }

        int pivotInd=partition(arr,low,high);
        quickSort(arr,low,pivotInd-1);
        quickSort(arr,pivotInd+1,high);

    }

    static int partition(int arr[], int low, int high)

    {
        int pivot=arr[high];

        int i=low-1;

        for(int j=low;j<high;j++){

            if(arr[j]<=pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }

        }

        i++;

        int temp=pivot;
        arr[high]=arr[i];
        arr[i]=temp;

        return i;

    }

}

