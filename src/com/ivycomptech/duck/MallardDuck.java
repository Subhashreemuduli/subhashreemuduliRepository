package com.ivycomptech.duck;

public class MallardDuck implements Floatable,Flayable,Swimmable,Walkable,Noise{


    public void fly() {

        System.out.println("It can fly");
    }

    public void noise() {
        System.out.println("It can make Noise");

    }
    public void swim() {
        System.out.println("It can swim");

    }

    public void walk() {
        System.out.println("It can walk");

    }


    public void floatable() {
        System.out.println("It can float");

    }
}
