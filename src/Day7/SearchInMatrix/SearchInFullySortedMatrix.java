package Day7.SearchInMatrix;

import java.util.Arrays;

public class SearchInFullySortedMatrix {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(matrixBinarySearch(array, 7)));
    }


    static int [] matrixBinarySearch(int [][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (matrix.length==1){
           return simpleBinarySearch(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = (cols)/2;
        // Run the loop till there are two rows remaining
        while(rStart<rEnd-1) { // While this is true are more than 2 rows are remaining
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            }
        }
        // After finishing the loop  there are only two rows are remaining;
            if (matrix[rStart][cMid]==target){
                return new int[]{rStart,cMid};
            }
            if (matrix[rEnd][cMid]==target){
                return  new int[]{rEnd,cMid};
            }
            if (target<=matrix[rStart][cMid-1]){
                return  simpleBinarySearch(matrix, rStart, 0, cMid-1, target);
            }
            if (target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
                  return  simpleBinarySearch(matrix, rStart, cMid+1, cols-1,target);

            }if (target<=matrix[rEnd][cMid-1]){
                return  simpleBinarySearch(matrix, rEnd, 0, cMid-1, target);
            }if (target>=matrix[rEnd][cMid+1]) {
            return simpleBinarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        }
        return new  int[]{-1,-1};

    }





   //Binary Search In Single Array
    static int[] simpleBinarySearch(int[][] array, int row, int start, int end,int target){
        if (array.length==0){
            return  new int[]{-1,-1};
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if (array[row][mid]==target){
                return  new int []{0,mid};
            } else if (array[row][mid]>target) {
                end = mid-1;

            } else if (array[row][mid]<target) {
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
