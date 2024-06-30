package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array  = {5,4,3,2,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSort(int [] array){
        boolean isSorted = false;
       int k = array.length-2;
        while (!isSorted) {
            // Assuming the array is sorted
            isSorted = true;
            for (int i = 0; i <=k; i++) {
                int j = i + 1;
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    // If this is if block is executed, then we have to run for loop again.
                    // If this is if loop is not executed, then we know the array is sorted so we dont have to run the loop
                    isSorted = false;
                }
            }
            --k;
        }

    }
}
