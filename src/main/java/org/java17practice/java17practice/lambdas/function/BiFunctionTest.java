package org.java17practice.java17practice.lambdas.function;

import javax.print.DocFlavor;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        String sentence = "My age is ";
        int age = 23;
        String full = concatenate(sentence, age,(x,y)->x.concat(y.toString()));
        System.out.println(full);

    }

    private static <T, U, R> R concatenate(T t, U u, BiFunction<T,U, R> biFunction){
        return biFunction.apply(t, u);
    }
}
