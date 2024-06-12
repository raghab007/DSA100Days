package Day3;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.12777f;
        System.out.printf("The formatted number is: %.2f", a); // It also round off the number
        System.out.println(56);
        System.out.println('a'+'b');
        System.out.println(20+'a');
        System.out.println("Raghab"+new ArrayList<>());
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // This is same as after the few steps : "a" + "1"
        // Integer will be converted into wrapper class Integer that will call ToString
       // System.out.println(new ArrayList<>()+new ArrayList<>()); This will give error
        // Java  provides operator overloading for + operator.
        String ans =   new ArrayList<>()+ ""+new ArrayList<>();
        System.out.println(ans);// This will work.+ operator will work if any one of them is String
    }
}
