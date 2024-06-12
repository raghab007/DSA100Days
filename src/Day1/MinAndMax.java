package Day1;

public class MinAndMax {
    public static void main(String[] args) {
        int [] numbers = {-100,-1100,8,4,566,68,-200,66};
        System.out.println(min(numbers));
        System.out.println(max(numbers));

    }

    static int min(int [] array){
        int min   = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;

    }

    static  int max(int [] array){
        int max = array[0];
        for(int element:array){
            if (element>max){
                max = element;
            }
        }
        return max;
    }

    static int maxBetween(int[] array,int start, int end){
        int max = array[start];
        for (int i=0;i<=end;i++){
            int element = array[i];
            if(max<element){
                max = element;
            }
        }
        return max;
    }
    static int minBetween(int[] array,int start, int end){
        int min = array[start];
        for (int i=0;i<=end;i++){
            int element = array[i];
            if(min>element){
                min = element;
            }
        }
        return min;
    }
}
