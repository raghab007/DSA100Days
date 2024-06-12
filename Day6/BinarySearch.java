package Day6;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println(binarySearch(arr, -1)); // Should return -1
        System.out.println(binarySearch(arr, 4));  // Should return 3
        System.out.println("Hello world");

        System.out.println(binarySearchRecursion(arr, 10, 0, arr.length-1)); // Should return 7
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return target;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursion(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = (start + end) / 2;

        if (array[mid] == target) {
            return target;
        } else if (target > array[mid]) {
            return binarySearchRecursion(array, target, mid + 1, end);
        } else {
            return binarySearchRecursion(array, target, start, mid - 1);
        }
    }
}


