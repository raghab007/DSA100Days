package Day11_Patterns;

public class RightTriangle {
    public static void main(String[] args) {
        print(5);
        reverse(5);
    }


    static void print(int length){
        for (int i=1;i<=length;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void reverse(int length){
        for (int i=length;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
