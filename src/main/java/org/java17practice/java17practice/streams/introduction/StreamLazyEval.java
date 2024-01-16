package org.java17practice.java17practice.streams.introduction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLazyEval {
    public static void main(String[] args) {
        Stream<Double> doubleStream = Stream
                .generate(Math::random)
                .limit(10);

        int intValue = doubleStream
                .mapToInt(Double::intValue).sum();
        System.out.println(intValue);


    }
}
