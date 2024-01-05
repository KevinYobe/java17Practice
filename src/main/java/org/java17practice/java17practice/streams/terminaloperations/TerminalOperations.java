package org.java17practice.java17practice.streams.terminaloperations;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        int[] arr = {1,3, 4,5,6};
        IntStream intStream = Arrays.stream(arr);
        int x = intStream.map(y->y+y).max().getAsInt();
        System.out.println(x);


    }
}
