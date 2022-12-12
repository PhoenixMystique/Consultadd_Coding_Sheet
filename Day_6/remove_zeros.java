class Solution {
    void pushZerosToEnd(int[] arr, int n) {


        int i = 0;
        for (int j = 0; j < n; j++) {


            if (arr[i] != 0) {
                i++;
                continue;
            }


            if (arr[i] == 0) {
                if (arr[j] != 0) {
                    swap(arr, i, j);
                    ++i;
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}