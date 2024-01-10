package org.java17practice.java17practice.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(Integer.valueOf(5));
        collection.add(Integer.valueOf("31"));
        collection.add(10);
        collection.add(3);
        collection.add(39);
        collection.add(3);
        collection.add(1);
        collection.add(3);
        collection.add(39);
        collection.add(3);
        collection.add(1);
        collection.add(3);
        collection.add(39);
        collection.add(3);
        collection.add(1);

        System.out.println(collection);
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(3);
        newList.add(39);
        collection.retainAll(newList);
        System.out.println(collection);
    }
}
