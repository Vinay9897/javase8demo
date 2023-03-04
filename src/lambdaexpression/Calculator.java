package lambdaexpression;

import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Addition of two values");
        System.out.println(evalute(2, 3, (val1, val2) -> val1 + val2));
        System.out.println(evalute(7, 2, (val1, val2) -> val1 - val2));
        System.out.println(evalute(7, 2, (val1, val2) -> val1 * val2));

    }

    public static int evalute(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
        return fn.apply(t, u);
    }
}
