package Day13.leetcode;

import java.util.Arrays;

public class TwoSumArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {5,6,7,8,9};
        System.out.println(Arrays.toString(twoSum(array1, array2)));
        System.out.println(Arrays.toString(find(array1,9)));
    }

    static int [] find(int [] array,int target){
      int arrayLength = array.length;
      for (int i=0;i<arrayLength;i++){
          for (int j=0;j<arrayLength;j++){
              if (i!=j &&array[i]+array[j]==target){
                  return new int[]{array[i],array[j]};
              }
          }
      }

      return new int[]{-1,-1};

    }

    public static int[] twoSum(int[] arr1, int[]arr2){
    int[] arr3 = new int [arr1.length];
    int length = arr1.length;
    if(arr1.length != arr2.length){
        return new int[] {-1};
    }
    for(int i=0; i<arr1.length; i++){
        arr3[i] = arr1[i] + arr2[i];
    }
    return arr3;
    }


}
