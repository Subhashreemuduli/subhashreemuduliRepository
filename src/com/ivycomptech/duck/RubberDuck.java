package com.ivycomptech.duck;

public class RubberDuck implements Squeezable,Noise,Floatable{

    public void floatable() {
        System.out.println("Rubber duck can float on water");

    }


    public void noise() {
        System.out.println("Rubber duck can make noise");

    }


    public void squeeze() {
        System.out.println("We can squeeze rubber duck");

    }
}
