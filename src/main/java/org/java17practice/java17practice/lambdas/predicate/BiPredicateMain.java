package org.java17practice.java17practice.lambdas.predicate;

import java.util.function.BiPredicate;

public class BiPredicateMain<T, U> {
    public static void main(String[] args) {
        String str = "This";
        Integer len = 4;
        System.out.println("Checking if the entered number equal to the string length  " + negated(str, len, (s, i) ->s.length()==i));
    }

    public static <T, U> boolean check(T t, U u, BiPredicate<T, U> biPredicate){
        return biPredicate.test(t, u);
    }
    public static <T, U> boolean negated(T t, U u, BiPredicate<T, U> biPredicate){
        return biPredicate.negate().test(t, u);
    }
}
