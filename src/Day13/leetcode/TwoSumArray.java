package Day13.leetcode;

public class TwoSumArray {

    static int [] find(int [] array,int target){
        int arrayLength = array.length;
        for (int i=0;i<arrayLength;i++){
            for (int j=0;j<arrayLength;j++){
                if (j==i){
                    continue;
                }
                int number = array[i]+array[j];
                 if (number==target){
                     return new int [] {i,j};
                 }
            }

        }
        return new int[]{-1,-1};
    }


}
