package com.ivycomptech.duck;

public class DuckDriver {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck=new WoodenDuck();
        mallardDuck.fly();
        mallardDuck.floatable();
        mallardDuck.swim();
        rubberDuck.noise();
        rubberDuck.squeeze();
        woodenDuck.decorate();
    }
}
