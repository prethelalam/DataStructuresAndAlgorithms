public class HeapSort {
    //create a counter variable to count each time a comparison is made
    static int comparisonCounter = 0;

     //create a movement/swapping counter variable to count each time a swap/element moves
    static int movementCounter = 0;

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) 
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //movement counter variable
            movementCounter++;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) 
        {   
            //comparison counter variable
            comparisonCounter++;
            largest = left;
        }
            

        if (right < n && arr[right] > arr[largest]) 
        {
            //comparison counter variable
            comparisonCounter++;
            largest = right;
        }
            

        if (largest != i) 
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            //movement counter variable
            movementCounter++;

            heapify(arr, n, largest);
        } 
    }
}