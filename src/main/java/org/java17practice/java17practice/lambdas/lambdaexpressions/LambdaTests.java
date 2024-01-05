package org.java17practice.java17practice.lambdas.lambdaexpressions;

import java.util.function.BinaryOperator;

public class LambdaTests {

    private static String name = "Kevin";
    private static String lastName = "  Yobe";
    public static void main(String[] args) {
        BinaryOperator<String> bin = (x,y)->x.concat(y);
        String str = bin.apply(name, lastName);
        System.out.println(str);
    }
}
