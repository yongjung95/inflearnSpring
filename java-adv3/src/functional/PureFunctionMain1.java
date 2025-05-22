package functional;

import java.util.function.Function;

public class PureFunctionMain1 {

    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x * 2;
        System.out.println("result1 = " + function.apply(10));
        System.out.println("result2 = " + function.apply(10));
    }
}
