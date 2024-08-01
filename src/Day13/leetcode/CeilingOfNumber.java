package Day13.leetcode;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] array = {4,6,7,9,10,15};
        System.out.println(ceilingOfNumber(array, 11));
        System.out.println(ceilingOfNumber(array, 12));
        System.out.println(ceilingOfNumber(array, 5));
        System.out.println(ceilingOfNumber(array,16));
    }

   static public int ceilingOfNumber(int [] array, int target){
        if (array.length==0 && array[0]>target){
            return array[0];
        }
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (array[mid]==target){
                return target;
            } else if (array[mid]<target) {
                start = mid+1;

            } else if (array[mid]>target && array[mid-1]>target) {

                end = mid;

            } else if (array[mid]>target && array[mid-1]<target) {
                // This is the ceiling of number
                return array[mid];

            }
        }
        return -1;
    }
}
