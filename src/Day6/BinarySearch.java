package Day6;
public class BinarySearch {
    public static void main(String[] args) {
         int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
         int [] array = {100,80,60,50,4,3,2,1};
         int [][] TwoDArray = {{1,2,3,4},{44,55,66,777},{9,0,2,3}};
         System.out.println(searchIn2DBS(TwoDArray, 55));
         System.out.println(orderAgnosticBS(array, 100));
         System.out.println(orderAgnosticBS(arr, 7)); 
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] == target) {
                return mid;
            }
    
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    

    static int binarySearchRecursion(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = start+(start - end) / 2;

        if (array[mid] == target) {
            return target;
        } else if (target > array[mid]) {
            return binarySearchRecursion(array, target, mid + 1, end);
        } else {
            return binarySearchRecursion(array, target, start, mid - 1);
        }
    }


    static int searchIn2DBS(int [][] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int element = arr[i][j];
                if (element==target) {

                    return target;
               }
            }
        }
        return -1;

    }
}


