public class MergeSort {
    //create a counter variable to count each time a comparison is made
    static int comparisonCounter = 0;

     //create a movement/swapping counter variable to count each time a swap/element moves
    static int movementCounter = 0;

    public static void mergeSort(int[] arr, int left, int right) 
    { 
        //create a variable to track the amount of time taken to sort the array
        long startTime = System.nanoTime();

        if (left < right) 
        {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

        
    }

    private static void merge(int[] arr, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) 
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++) 
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) 
        {
            //comparison counter variable
            comparisonCounter++;
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++; 
            } 
            else 
            {
                arr[k] = R[j];
                j++; 
            }

            k++; 
            //movement counter variable
            movementCounter++;
        }
        while (i < n1) 
        {
            arr[k] = L[i];
            i++;
            k++; 
            //movement counter variable
            movementCounter++;
        }
        while (j < n2) 
        {
            arr[k] = R[j];
            j++;
            k++; 
            //movement counter variable
            movementCounter++;
        }
    } 
}