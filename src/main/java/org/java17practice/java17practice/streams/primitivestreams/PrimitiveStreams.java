package org.java17practice.java17practice.streams.primitivestreams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] ints = {1,8,5,58,85};
        double[] doubles = {1.25, 88.52, 55.7};
        long[] longs = {10L, 11L, 31L};

        IntStream intStream = Arrays.stream(ints);
        DoubleStream doubleStream = Arrays.stream(doubles);
        LongStream longStream = Arrays.stream(longs);

        IntStream intStream1 = IntStream.of(1,2,3,4,5,-100, -10,6,3,2,1);
        DoubleStream doubleStream1 =  DoubleStream.of(1.2, 32.1);
        LongStream longStream1 = LongStream.of(90L,9L, 14L);

        System.out.println(intStream1.summaryStatistics());
    }
}
