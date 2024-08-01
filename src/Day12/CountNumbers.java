package Day12;

public class CountNumbers {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(count(number));
        System.out.println(count(123));
        System.out.println(count(1));
        System.out.println(hasEvenNumDigits(1234));
    }

    static  boolean hasEvenNumDigits(int number){
        int c = count(number);
        return c%2==0;
    }

    static int count(int number){
        if (number==0) {
            return 0;
        }
        int count = 0;
        while (number>0){
            number = number/10;
            count++;
        }
        return count;
    }
}
