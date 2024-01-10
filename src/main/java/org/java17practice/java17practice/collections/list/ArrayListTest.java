package org.java17practice.java17practice.collections.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        String [] names = {"Reagan", "Adrian ", "Lisa", "Adriel", "Nyasha"};
        List<String> cities = new ArrayList<>();
        List<String> list = Arrays.asList(names);
        list.set(1, "Kuda");
        System.out.println(list);
        Arrays.stream(names).forEach(System.out::println);
    }
}
