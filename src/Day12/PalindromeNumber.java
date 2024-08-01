package Day12;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
        System.out.println(isPalindrome(321));
        System.out.println(isPalindrome2(123));
        System.out.println(isPalindrome2(1111));
    }

    static boolean isPalindrome(int n){
        String number = Integer.toString(n);
        for (int i=0;i<=(number.length()-1)/2;i++){
            if (number.charAt(i)!=number.charAt(number.length()-1-i))return false;
        }
        return true;

    }

    static  boolean isPalindrome2(int num){
        String s = "";
        int originalNum  = num;
        while(num>0){
            s = s+(num%10);
            num = num/10;
        }
        int c = Integer.parseInt(s);
        return originalNum==c;
    }
}
