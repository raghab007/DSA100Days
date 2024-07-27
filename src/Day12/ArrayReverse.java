package Day12;

import java.util.Arrays;
public class ArrayReverse {
   static int [] array = {1,2,3,4,5,6};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getReverseArray(array)));
        reverseArray2(array);
        System.out.println(Arrays.toString(array));
    }

    static int [] getReverseArray(int [] array){
        int [] reversedArray = new int [array.length];
        for (int i=0;i< array.length;i++) {
            reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }

   static void reverseArray2(int [] array){
        int length = array.length;
        for (int i=0; i<= (length-1)/2 ;i++){
            int temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
   }
}

// int array = {1,2,3,4,5,6}

