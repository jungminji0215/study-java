package functionalInterface;

import java.util.function.BiFunction;

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (first, second) -> first * second;

        int number = biFunction.apply(5,6);

        System.out.println(number);
    }
}
