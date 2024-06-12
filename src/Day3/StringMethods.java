package Day3;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "   Aastha     ";
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split("")));
        System.out.println(name.indexOf('a'));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
