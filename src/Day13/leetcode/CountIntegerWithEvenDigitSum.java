package Day13.leetcode;

public class CountIntegerWithEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(countEven(30));
        System.out.println(countEven(10));
    }
    public static int countEven(int num) {
        int count = 0;
        for(int i=2;i<=num;i++){
            if(evenDigit(i)){
                count++;
            }
        }

        return count;
    }

    public static boolean evenDigit(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum +=digit;
            num = num/10;
        }
        return sum%2==0;
    }
}
