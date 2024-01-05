package org.java17practice.java17practice.lambdas.interfaces;

public class SoccerPlayer implements Athlete{
    public void exercise() {
        String message="Soccer player is exercising";
        System.out.println(message);
    }

    public void play(){
        String message="Player is playing soccer";
        System.out.println(message);
    }

    @Override
    public void excercise() {

    }
}
