package EngineeringDigest.FunctionInterface;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionOne {
    public static void main(String[] args) {
        // Function Interface is a FunctionalInterface having abstract method as apply.
        Function<String,String> toLowercase = String::toLowerCase;
        Function<String,String> firsFour = s->s.substring(0, 4);
        System.out.println(toLowercase.apply("RAGHAB"));
        System.out.println(firsFour.apply("Raghab"));
        Function<String,String> firstFourLowerChar = toLowercase.andThen(firsFour);
        System.out.println(firstFourLowerChar.apply("RAGHAB"));
       Function<String,String> function = Function.identity();
        System.out.println(function.apply("Raghab"));


    }
}
