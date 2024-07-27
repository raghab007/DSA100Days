package EngineeringDigest;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Predicate Examples
//        Predicate<Integer> predicateOne = (x)->x>500;
//        Predicate<Integer> predicateTwo = (x)->x<1000;
//        System.out.println(predicateOne.test(1000));
//        System.out.println(predicateOne.test(400));
//        Predicate<Integer> predicateCombination = predicateOne.and(predicateTwo);
//        System.out.println(predicateCombination.test(400));
//        Predicate<Integer> negatePredicate = predicateCombination.negate();
//        System.out.println(negatePredicate.test(1100));
        User user = new User("Raghab",20);
        User user1 = new User("Sudarshab",53);
        Predicate<User> predicate = (x)-> user.age()>15;
        Predicate<User> predicate1 = (x)->x.name().toLowerCase().contains("z");
        System.out.println(predicate.test(user));
        System.out.println(predicate.test(user1));
        System.out.println(predicate1.test(user));
        

    }
}

record User(String name, int age){

}
