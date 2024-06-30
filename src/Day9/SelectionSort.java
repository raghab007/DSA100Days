package Day9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    private  static void selectionSort(int [] array){
        int arrayLength = array.length;
        // For loop to place the element in the right index
        for (int i=0;i<arrayLength-1;i++){
            int minIndex = i;
            for (int k = i+1;k<=arrayLength-1;k++){
                if (array[k]<array[minIndex]){
                    minIndex =k;
                }
            }
         int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;

        }

    }
}
