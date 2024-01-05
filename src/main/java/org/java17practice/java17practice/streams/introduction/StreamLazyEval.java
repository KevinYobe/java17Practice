package org.java17practice.java17practice.streams.introduction;

import java.util.stream.Stream;

public class StreamLazyEval {
    public static void main(String[] args) {
        Stream<Double> doubleStream = Stream
                .generate(Math::random)
                .limit(100);

    }
}
