package org.java17practice.java17practice.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("Tino");
        linkedList.add("Alex");
        linkedList.add("Reagan");
        linkedList.add("Mike");
        linkedList.addFirst("Mike");
        linkedList.addLast("Adrian");
        linkedList.add("Kuda");
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);

    }
}
