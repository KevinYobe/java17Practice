package org.java17practice.java17practice.lambdas.function;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String country = "Zimbabwe";
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        int countrySize = getSize(country, String::length);
        int arrayListSize = getSize(integers, ArrayList::size);
        System.out.println(countrySize);
        System.out.println(arrayListSize);

    }

    private static <T> int getSize(T t, Function<T,Integer> function){
        return function.apply(t);
    }
}
