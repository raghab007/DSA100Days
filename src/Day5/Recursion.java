package Day5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(15));
        System.out.println(power(2, 5));
        System.out.println(power(100, 10));
    }





    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);

    }

    public static int power(int n, int pow){
        if (pow==0){
            return 1;
        } else if (pow==1) {

            return n;

        }

        return n*power(n,pow-1);
    }


    public static int binarySearch(int [] array, int target){

        return 0;

    }
}
