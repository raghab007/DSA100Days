package Day10.LeedCodeProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {0,1,2,3};
        System.out.println(missingNumber(array));

    }

    static int missingNumber(int [] array) {
        int l = array.length;
        int i = 0;
        while (i < l) {
            int correctIndex = array[i];
            if (correctIndex < l && array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }
        int k = 0;
        while(k<l){

            if (k!=array[k]){
               return k;
            }
            k++;
        }

        return l;
    }

    static void swap(int [] array, int a , int b){
            int c = array[a];
            array[a] = array[b];
            array[b] = c;
        }


    }


