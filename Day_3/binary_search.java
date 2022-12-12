class Solve {

    static int searchInSorted(int arr[], int N, int K) {

        int low = 0;
        int high = N - 1;
        int mid;
        while (low <= high) {

            mid = low + (high - low) / 2;
            if (K < arr[mid]) {
                high = mid - 1;
            }
            else if (K > arr[mid]) {

                low = mid + 1;

            }
            else {
                return 1;
            }
        }

        return -1;

    }
}