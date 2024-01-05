package org.java17practice.java17practice.lambdas.predicate;

import org.java17practice.java17practice.lambdas.interfaces.Athlete;
import org.java17practice.java17practice.lambdas.interfaces.SoccerPlayer;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Integer in = Integer.parseInt("5");
        Integer in2 = Integer.parseInt("11");
        Integer in3 = Integer.parseInt("5");
        Integer in4 = Integer.parseInt("0");

        Predicate<Integer> predicate = integer -> integer%2==0;
        System.out.println("Even test for "+ in + "  "+ check(in, predicate));
        //Using predicate or
        System.out.println("Even or not equal to 0 " + in2 + "  " + predicate.or(integer -> integer!=0).test(in4));
        //Using predicate and
        System.out.println("Even and greater than 5 " + in2 + "  " + predicate.and(integer -> integer>5).test(in2));
    }

    public static <T> boolean check(T t, Predicate<T> predicate){
       return predicate.test(t);
    }
}
