public class InsertionSort {
    //create a counter variable to count each time a comparison is made
    static int comparisonCounter = 0;

    //create a movement/swapping counter variable to count each time a swap/element moves
    static int movementCounter = 0;

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j]; 
                j = j - 1;

                comparisonCounter++; //while loop counter
            }
            arr[j + 1] = key;

            //movement counter
            movementCounter++;
        }        
    }
}
