package org.java17practice.java17practice.lambdas.interfaces;

public interface Athlete {

    void excercise();
    default void exercise(String athlete){
        String message = athlete+" is in the gym, doing some workouts";
        System.out.println("This is a default method "+message);
    }
}
