package org.java17practice.java17practice.streams.introduction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        //Using array.
        Double[] doubleNums = {1.1, 2.0, 3.5, 4.5, 990.1};
        Stream<Double> doubleNumbsStream = Arrays.stream(doubleNums);
                doubleNumbsStream.forEach(System.out::println);
        //Using the List.stream() method of Collections interface
        List<String> list = List.of("Kevin ", "Praise ", "Adriel ", "Adriella " );
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        //Using Stream.of
        Stream<Double> doubleStream = Stream.of(10.5, 11.5);
        doubleStream.forEach(System.out::println);

        // Using Files.stream() method
        Path path = Paths.get("file.txt");
        try(Stream<String> stream1 = Files.lines(path)){
            stream1.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Using a builder method
        Stream<Object> builderStream = Stream.builder()
                .add("Kevin Hart")
                .add("Gabriel Iglesius")
                .add("Nijo")
                .build();
        builderStream.forEach(System.out::println);
        // Using the Concat method
        Stream<Double> doubleStream1 = Stream.of(10.12, 11.5);
        Stream<Double> doubleStream2 = Stream.of(10.5, 11.5);

        Stream<Double> concatStreams = Stream.concat(doubleStream1, doubleStream2);
        concatStreams.forEach(System.out::println);

        //Infinite Streams
        Stream<Double> doubleStream3 = Stream.iterate(1.1, n->n*2);
        doubleStream3
                .limit(30)
                .forEach(System.out::println);

        Stream<Double> integerStream = Stream.generate(Math::random)
                .limit(100);
        integerStream.forEach(System.out::println);
    }
}
