package Day11_Patterns;

public class Rectangle {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int length){
        for (int i=1;i<=length;i++){
            for (int j=1;j<=length;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
