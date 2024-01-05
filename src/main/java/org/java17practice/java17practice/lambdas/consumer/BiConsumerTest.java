package org.java17practice.java17practice.lambdas.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        Map<Integer, String> cities = new HashMap<>();
        addValues(1, "Harare", cities::put);
        addValues(2, "Gaborone", cities::put);
        System.out.println(cities);
    }

    public static <T, U> void addValues(T key, U value, BiConsumer<T, U> biConsumer){
        biConsumer.accept(key, value);
    }


}
