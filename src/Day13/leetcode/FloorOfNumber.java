package Day13.leetcode;

public class FloorOfNumber {
    public static void main(String[] args) {

        //int [] array = {1,2,4,5,6,8};
       // System.out.println(getFloor(array, 6));
        System.out.println(1/10);
    }

    static int getFloor(int [] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (array[mid]>target){
                end = mid-1;
            }else if (array[mid]==target){
                start = mid+1;
            }
        }
        return end;
    }

}
