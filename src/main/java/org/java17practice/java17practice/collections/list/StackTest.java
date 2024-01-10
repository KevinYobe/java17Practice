package org.java17practice.java17practice.collections.list;

import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Tino");
        stack.push("Alex");
        stack.push("Reagan");

        System.out.println(stack);

        String s = stack.pop();
        System.out.println(s);
        System.out.println(stack);
    }
}
