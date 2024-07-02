package Day10;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] array = {6,5,4,3,2,1};
        cycleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void cycleSort(int [] array) {
        int i = 0;
        // Running loop till the end
        while (i<array.length){
            int correctIndex = array[i]-1;
            if (correctIndex(array,i,correctIndex)){
                i++;
            }else {
                swap(array, i,correctIndex);
            }
        }
    }
    // This function swaps the elements
    private  static void swap(int [] array, int a , int b){
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }



    // This function checks if the element is in the correct index or not
    private static boolean correctIndex(int [] array,int i, int correctIndex){
        return array[i]==array[correctIndex];
    }
}
