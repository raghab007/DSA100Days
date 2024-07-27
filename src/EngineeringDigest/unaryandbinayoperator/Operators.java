package EngineeringDigest.unaryandbinayoperator;

import java.util.function.UnaryOperator;

public class Operators {
    public static void main(String[] args) {
        UnaryOperator<Integer> integerUnaryOperator = x->x*2;
        System.out.println(integerUnaryOperator.apply(2));
        System.out.println(integerUnaryOperator.apply(20));
    }
}
