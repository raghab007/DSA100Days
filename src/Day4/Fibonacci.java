package Day4;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));

    }

    static int fibonacci(int n){
        // Base condition
        

        return  fibonacci(n-1)+fibonacci(n-2);
    }
}
