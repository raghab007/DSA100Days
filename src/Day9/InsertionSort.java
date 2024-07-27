package Day9;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {5,3,4,2,1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void insertionSort(int [] array) {
        if (array.length==1){
            return;
        }

        int arrayLength = array.length;
        for (int i = 0; i <= arrayLength - 2; i++) {
            // Swapping till the element gets the right position and sorting till the index i+1
            while (i >= 0) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    i--;
                }
                else {
                    break;
                }
            }

        }
    }
    // Swapping two elements in the array
    private static void swap(int array[],int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
     }
}
