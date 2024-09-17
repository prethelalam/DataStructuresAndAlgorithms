public class QuickSort {
    //create a counter variable to count each time a comparison is made
    static int comparisonCounter = 0;

    //create a movement/swapping counter variable to count each time a swap/element moves
    static int movementCounter = 0;

    public static void quicksort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {            
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) 
        {
            //comparison counter variable
            comparisonCounter++;
            if (arr[j] < pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                //movement counter variable
                movementCounter++;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        //movement counter variable
        movementCounter++;

        return i + 1;
    }
}