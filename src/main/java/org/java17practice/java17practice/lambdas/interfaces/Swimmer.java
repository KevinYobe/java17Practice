package org.java17practice.java17practice.lambdas.interfaces;

public class Swimmer implements Athlete {

    public void swim(){
        String message="Swimmer is swimming";
        System.out.println(message);
    }
    @Override
    public void excercise() {
        System.out.println("Swimmer is exercising");
    }
}
