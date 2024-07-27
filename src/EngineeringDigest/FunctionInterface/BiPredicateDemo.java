package EngineeringDigest.FunctionInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,String> predicate = (x,str)->{ return str.length()==x;};
        BiFunction<Integer,Integer,Integer> sumPredicate = (x,y)->x-y;
        BiConsumer<String,Integer> integerBiConsumer = (x,y)->{
            System.out.println("My name is "+x+" And the age is: "+y);
        };
        System.out.println(predicate.test(6, "Raghab"));
        System.out.println(sumPredicate.apply(2, 2));
       integerBiConsumer.accept("Raghab", 20);

    }
}
