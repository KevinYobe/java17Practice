package org.java17practice.java17practice.lambdas.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = ()->new String("Test");

        Supplier<LocalDateTime> dateSupplier = ()-> LocalDateTime.now();
        System.out.println(stringSupplier.get());
        System.out.println(dateSupplier.get());

        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        ArrayList<String> arrayList = arrayListSupplier.get();

        arrayList.add("here");
        arrayList.add("there");
        arrayList.add("also");

        arrayList.forEach(System.out::println);
    }
}
