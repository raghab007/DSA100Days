package Day13.leetcode;

import java.util.Arrays;

class FirstAndLastPosition {

    public static void main(String[] args) {
         int [] array = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(array, 6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] indexes = new int [] {-1,-1};
        if(nums.length==0){
            return indexes;
        }

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if (nums[mid]<target){
                start = mid+1;
            }else{
                indexes[0] = mid;
                end = mid-1;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if (nums[mid]<target){
                start = mid+1;
            }else{
                indexes[1] = mid;
                start = mid+1;
            }
        }
        return  indexes;
    }
}