package org.java17practice.java17practice.collections.set;

import java.util.LinkedHashSet;

public class HashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Kudakwashe");
        linkedHashSet.add("Kudakwashe12");
        linkedHashSet.add("Kudakwashe14");
        linkedHashSet.addLast("Tino");
        linkedHashSet.addFirst("Kuda");
        System.out.println(linkedHashSet);
    }
}
