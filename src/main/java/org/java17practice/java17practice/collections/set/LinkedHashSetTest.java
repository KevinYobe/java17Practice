package org.java17practice.java17practice.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.addFirst("kevin");
        hashSet.add("kevin1");
        hashSet.add("kevin2");
        hashSet.add("kevin3");
        hashSet.addFirst("KEVIN");
        hashSet.removeFirst();
        System.out.println(hashSet);
        System.out.println();

    }
}
