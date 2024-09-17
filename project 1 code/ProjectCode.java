import java.util.Random;
//import java.util.Array;

public class ProjectCode{

    //method to put random numbers in testing arrays
    // public static int[] insertRandomNums(int[] testArray, Random randomNumbers)
    // {
    //     //first put random numbers in array
    //     for(int i = 0; i < testArray.length; i++)
    //     {
    //         int testRandomNumbers = randomNumbers.nextInt(10);

    //         testArray[i] = testRandomNumbers;
    //     }

    //     for(int i = 0; i < testArray.length; i++)
    //     {
    //         System.out.println(testArray[i]);
    //     }
        

        

    //     return testArray;
    // }

    //method to check if sorting algorithms worked
    public static void testingSortingAlgorithms(int[] sortedTestArray)
    {
        boolean status = false;

        //check to see if array is sorted
        for(int i = 0; i < sortedTestArray.length - 1; i++)
        {
            if(sortedTestArray[i] > sortedTestArray[i + 1])
            {
                status = false;
            }
            else
            {
                status = true;
            }
        }

        if(status == false)
        {
            System.out.println("Array was NOT sorted properly.");
            System.out.println();
        }
        else
        {
            System.out.println("Array was sorted properly.");
            System.out.println();
        }
    }



    // //method to check if sorting algorithms are working for actual arrays
    // public static boolean testSortingAlgorithms(int[] array, Random randomNumbers)
    // {
    //     boolean status = false;

    //     //first put random numbers in array
    //     for(int i = 0; i < array.length; i++)
    //     {
    //         int testRandomNumbers = randomNumbers.nextInt(10);

    //         array[i] = testRandomNumbers;
    //     }

    //     //sort array
    //     InsertionSort.insertionSort(array);

    //     //check to see if array is sorted
    //     for(int i = 0; i < array.length - 1; i++)
    //     {
    //         if(array[i] > array[i + 1])
    //         {
    //             status = false;
    //         }
    //         else
    //         {
    //             status = true;
    //         }
    //     }

    //     return status;
    // }


    public static void main(String[] args) {
        //insert test code with a small list. so verify all the sorting algos work with a small list

        //test array for insertion sort
        int[] testingInsertionSortArray = new int[10];

        //test array for quick sort
        int[] testingQuickSortArray = new int[10];

        //test array for merge sort
        int[] testingMergeSortArray = new int[10];

        //test array for heap sort
        int[] testingHeapSortArray = new int[10];

        //create tester random object
        Random testRandomNums = new Random();
        
        //initialize array with random numbers
        for(int i = 0; i < testingInsertionSortArray.length; i++)
        {
            int testRandomNumbers = testRandomNums.nextInt(10);

            testingInsertionSortArray[i] = testRandomNumbers;
            testingQuickSortArray[i] = testRandomNumbers;
            testingMergeSortArray[i] = testRandomNumbers;
            testingHeapSortArray[i] = testRandomNumbers;
        }

        //sort test arrays
        InsertionSort.insertionSort(testingInsertionSortArray);
        QuickSort.quicksort(testingQuickSortArray, 0, testingQuickSortArray.length - 1);
        MergeSort.mergeSort(testingMergeSortArray, 0, testingMergeSortArray.length - 1);
        HeapSort.heapSort(testingHeapSortArray);

        System.out.println("First we will test our sorting algorithms with a smaller array size:");
        System.out.println("--------------------------------------------------------------------\n");
        

        //check to see if arrays have been sorted
        System.out.println("Was the array sorted properly for insertion sort?");
        testingSortingAlgorithms(testingInsertionSortArray);

        System.out.println("Was the array sorted properly for quick sort?");
        testingSortingAlgorithms(testingQuickSortArray);

        System.out.println("Was the array sorted properly for merge sort?");
        testingSortingAlgorithms(testingMergeSortArray);

        System.out.println("Was the array sorted properly for heap sort?");
        testingSortingAlgorithms(testingHeapSortArray);

        System.out.println("\n\n*************************************************************************************************************************************************************************");


        




        //create an array with 50000 elements for insertion sort
        int[] insertionSortArray = new int[50000];

        //create an array with 50000 elements for quick sort
        int[] quickSortArray = new int[50000];

        //create an array with 50000 elements for merge sort
        int[] mergeSortArray = new int[50000];

        //create an array with 50000 elements for heap sort
        int[] heapSortArray = new int[50000];

        //create an random object
        Random randomNumbers = new Random();

        //insert the same random numbers into all 4 arrays
        for(int i = 0; i < insertionSortArray.length; i++)
        {
            int randomNums = randomNumbers.nextInt(50000);

            insertionSortArray[i] = randomNums;
            quickSortArray[i] = randomNums;
            mergeSortArray[i] = randomNums;
            heapSortArray[i] = randomNums;
        }





        System.out.println("\nWe will begin implementing the various sorting algorithms for the arrays with 50,000 elements:");
        System.out.println("----------------------------------------------------------------------------------------------\n\n");
        

                                        // Insertion sort (In order)
        System.out.println("Insertion sort will now begin for in order:");
        System.out.println("-------------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeInsertion = System.nanoTime();

        //sort the array in order for insertion sort
        InsertionSort.insertionSort(insertionSortArray);

        //create variables to track when program ends
        long endTimeInsertion = System.nanoTime();

        //find total time
        long totalTimeInsertion = endTimeInsertion - startTimeInsertion;

        //check to see if array was sorted properly
        testingSortingAlgorithms(insertionSortArray);

        //printing comparison and movement counter
        System.out.println("The insertion sort has completed, and it sorted an array with 50,000 elements (in order).");
        System.out.println("The total number of comparisons made was " + InsertionSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + InsertionSort.movementCounter + " movements.");
        System.out.println("The total time it took for the insertion sort was " + totalTimeInsertion + " nanoseconds.");
        System.out.println();

                                        // Insertion sort (reverse order)
        System.out.println("\nInsertion sort will now begin for reverse order:");
        System.out.println("------------------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeInsertionReverse = System.nanoTime();

        //sort the array in reverse order for insertion sort
        InsertionSort.insertionSort(insertionSortArray);

        //create variables to track when program ends
        long endTimeInsertionReverse = System.nanoTime();

        //find total time
        long totalTimeInsertionReverse = endTimeInsertionReverse - startTimeInsertionReverse;

        //printing comparison and movement counter
        System.out.println("The insertion sort has completed, and it sorted an array with 50,000 elements (reverse order).");
        System.out.println("The total number of comparisons made was " + InsertionSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + InsertionSort.movementCounter + " movements.");
        System.out.println("The total time it took for the insertion sort was " + totalTimeInsertionReverse + " nanoseconds.");
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************");
        System.out.println();




                                        // Quick sort (in order)
        System.out.println("Quick sort will now begin for in order:");
        System.out.println("---------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeQuick = System.nanoTime();

        //sort the array in order for quick sort
        QuickSort.quicksort(quickSortArray, 0, quickSortArray.length - 1);

        //create variables to track when program ends
        long endTimeQuick = System.nanoTime();

        //find total time
        long totalTimeQuick = endTimeQuick - startTimeQuick;

        //check to see if array was sorted properly
        testingSortingAlgorithms(quickSortArray);

        //printing comparison and movement counter
        System.out.println("The quick sort has completed, and it sorted an array with 50,000 elements (in order).");
        System.out.println("The total number of comparisons made was " + QuickSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + QuickSort.movementCounter + " movements.");
        System.out.println("The total time it took for the quick sort was " + totalTimeQuick + " nanoseconds.");
        System.out.println();


                                        // Quick sort (reverse order)
        System.out.println("\nQuick sort will now begin for reverse order:");
        System.out.println("--------------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeQuickReverse = System.nanoTime();

        //sort the array in reverse order for quick sort
        QuickSort.quicksort(quickSortArray, 0, quickSortArray.length - 1);

        //create variables to track when program ends
        long endTimeQuickReverse = System.nanoTime();

        //find total time
        long totalTimeQuickReverse = endTimeQuickReverse - startTimeQuickReverse;

        //printing comparison and movement counter
        System.out.println("The quick sort has completed, and it sorted an array with 50,000 elements (reverse order).");
        System.out.println("The total number of comparisons made was " + QuickSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + QuickSort.movementCounter + " movements.");
        System.out.println("The total time it took for the quick sort was " + totalTimeQuickReverse + " nanoseconds.");
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************");
        System.out.println();



                                        // Merge sort (in order)
        System.out.println("Merge sort will now begin for in order:");
        System.out.println("---------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeMerge = System.nanoTime();

        //sort the array in order for merge sort
        MergeSort.mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);

        //create variables to track when program ends
        long endTimeMerge = System.nanoTime();

        //find total time
        long totalTimeMerge = endTimeMerge - startTimeMerge;

        //check to see if array was sorted properly
        testingSortingAlgorithms(mergeSortArray);

        //printing comparison and movement counter
        System.out.println("The merge sort has completed, and it sorted an array with 50,000 elements (in order).");
        System.out.println("The total number of comparisons made was " + MergeSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + MergeSort.movementCounter + " movements.");
        System.out.println("The total time it took for the Merge sort was " + totalTimeMerge + " nanoseconds.");
        System.out.println();

                                        // Merge sort (reverse order)
        System.out.println("\nMerge sort will now begin for reverse order:");
        System.out.println("--------------------------------------------\n");

        //add code to test to make sure that the array is sorted before doing what is below

        //create a variable to track the amount of time taken to sort the array
        long startTimeMergeReverse = System.nanoTime();

        //sort the array in order for merge sort
        MergeSort.mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);

        //create variables to track when program ends
        long endTimeMergeReverse = System.nanoTime();

        //find total time
        long totalTimeMergeReverse = endTimeMergeReverse - startTimeMergeReverse;

        //printing comparison and movement counter
        System.out.println("The merge sort has completed, and it sorted an array with 50,000 elements (reverse order).");
        System.out.println("The total number of comparisons made was " + MergeSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + MergeSort.movementCounter + " movements.");
        System.out.println("The total time it took for the Merge sort was " + totalTimeMergeReverse + " nanoseconds.");
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************");
        System.out.println();


                                        // Heap sort (in order)
        System.out.println("Heap sort will now begin for in order:");
        System.out.println("--------------------------------------\n");

        //add code to test to make sure that the array is sorted before doing what is below

        //create a variable to track the amount of time taken to sort the array
        long startTimeHeap = System.nanoTime();

        //sort the array in order for heap sort
        HeapSort.heapSort(heapSortArray);

        //create variables to track when program ends
        long endTimeHeap = System.nanoTime();

        //find total time
        long totalTimeHeap = endTimeHeap - startTimeHeap;

        //check to see if array was sorted properly
        testingSortingAlgorithms(heapSortArray);

        //printing comparison and movement counter
        System.out.println("The heap sort has completed, and it sorted an array with 50,000 elements (in order).");
        System.out.println("The total number of comparisons made was " + HeapSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + HeapSort.movementCounter + " movements.");
        System.out.println("The total time it took for the Merge sort was " + totalTimeHeap + " nanoseconds.");
        System.out.println();

                                    // Heap sort (reverse order)
        System.out.println("\nHeap sort will now begin for reverse order:");
        System.out.println("-------------------------------------------\n");

        //create a variable to track the amount of time taken to sort the array
        long startTimeHeapReverse = System.nanoTime();

        //sort the array in order for heap sort
        HeapSort.heapSort(heapSortArray);

        //create variables to track when program ends
        long endTimeHeapReverse = System.nanoTime();

        //find total time
        long totalTimeHeapReverse = endTimeHeapReverse - startTimeHeapReverse;

        //printing comparison and movement counter
        System.out.println("The heap sort has completed, and it sorted an array with 50,000 elements (reverse order).");
        System.out.println("The total number of comparisons made was " + HeapSort.comparisonCounter + " comparisons.");
        System.out.println("The total number of movements made was " + HeapSort.movementCounter + " movements.");
        System.out.println("The total time it took for the Merge sort was " + totalTimeHeapReverse + " nanoseconds.");
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************");
    }
}