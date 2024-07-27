package Day12;

import java.util.Arrays;

public class SubArray {

    public static void main(String[] args) {
        int [] array1 = {1,6,3,2,4,5};
        int [] array = {4,5,6,7};
        sortArray(array);
        System.out.println(subArray(array1, array));
        System.out.println(Arrays.toString(array));
    }

    static boolean subArray(int [] bigArray,int[] smallArray){
        int n = 0;
        if (bigArray.length<smallArray.length){
            return false;
        }
        sortArray(bigArray);
        sortArray(smallArray);

        for (int number : smallArray) {
            if (binarySearch(bigArray, number)) {
                n++;
            }
        }
        return n==smallArray.length;
    }

    // This bubble sort can be replaced with more efficient sorting algorithms ==> Cyclic, Merge and may more
    static void sortArray(int [] array){
        int arrayLength = array.length;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i =0; i<arrayLength-1;i++){
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    static  boolean binarySearch(int [] array,int target){
        int arrayLength = array.length;
        int start = 0;
        int end = arrayLength-1;
        boolean found = false;
        while (start<=end){
            int mid = (start+end)/2;
            if (array[mid]==target){
                return true;
            }else if (array[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return  false;

    }
}
