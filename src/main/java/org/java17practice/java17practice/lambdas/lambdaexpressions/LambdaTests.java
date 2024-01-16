package org.java17practice.java17practice.lambdas.lambdaexpressions;


import org.java17practice.java17practice.lambdas.interfaces.Person;

import java.util.Locale;
import java.util.function.*;

public class LambdaTests {

    static class Person{
       private int id;
       private double age;

    }

    public static void main(String[] args) {
        Predicate<String> test = a->a.equals("animal");
        Predicate<String> test2 = a->a.startsWith("key");
        Predicate<String> pred = test.or(test2);
        System.out.println(test2.test("key"));
        Function<String, Integer> stringToInt = (x)->Integer.valueOf(x)*2;
        Function<Integer, String> doubleNum = x-> String.valueOf(x) +5;
        System.out.println(stringToInt.compose(doubleNum).apply(5));

        ToDoubleFunction<String> toDoubleBiFunction= Double::parseDouble;
        ToIntFunction<Person> personToIntFunction = x->x.id;
        Person person = new Person();
        person.age = 12;
        System.out.println(personToIntFunction.applyAsInt(person));
    }
}
