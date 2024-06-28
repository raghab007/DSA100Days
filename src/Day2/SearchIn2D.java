package Day2;


public class SearchIn2D {
    public static void main(String[] args) {
        int [][] array = {{1,2,3,5,6},{8,9,10,11},{1000,200,300,200}};
        System.out.println(searchIn2DMax(array));

    }
    public static int searchIn2DMax(int [][] array){
        int max = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(max<array[i][j]) {
                    max = array[i][j];

                }
            }
        }
        return  max;

    }
    public static int searchIn2DMin(int [][] array){
        int min = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if(min>array[i][j]) {
                    min = array[i][j];

                }
            }
        }
        return  min;

    }
}
