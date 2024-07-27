package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class One {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int sum = Arrays.stream(nums).filter(x->x%2==0).sum();
        System.out.println(sum);

    }
}
