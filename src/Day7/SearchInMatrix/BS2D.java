package Day7.SearchInMatrix;

import java.util.Arrays;

public class BS2D {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{55,66,77,88}};
        System.out.println(binarySearch2D(matrix, 77));
        
    }

    static String binarySearch2D(int [][] arr,int target){
        int row = 0;
        int col = arr[row].length-1;
        while(col>=0 && row< arr.length){
            if (arr[row][col]>target) {
                 --col;
                
            }
            else if (arr[row][col]<target) {
                ++row;
     
            }else {

                return Arrays.toString(new int[]{row,col});
            }

        }

        return Arrays.toString(new int[]{-1,-1});

    }

    
}
