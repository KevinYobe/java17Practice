package org.java17practice.java17practice.collections.queue;

import java.util.ArrayDeque;
public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(Integer.valueOf("21"));
        arrayDeque.push(121);
        arrayDeque.push(31);
        arrayDeque.push(90);
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
    }



}
