package org.java17practice.java17practice.lambdas.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest<T> {
    public static void main(String[] args) {
        ArrayList<String> strings =new ArrayList<>();
        ArrayList<Integer> integers =new ArrayList<>();
        addElementToConsumer3(31, integers::add);
        addElementToConsumer3("Kevin", strings::add);

        Integer integer = getElements(()->integers.get(0));
        String string = getElements(()->strings.get(0));

        System.out.println(integers.size());
        System.out.println(string);

    }

    public static <T> void addElementToConsumer(T element, Consumer<T> consumer){
        consumer.accept(element);
    }

    public static <T> void addElementToConsumer3(T element, Consumer<T> consumer){
        consumer.andThen(consumer).accept(element);
    }

    public static <T> T getElements(Supplier<T> supplier){
        return supplier.get();
    }
}
