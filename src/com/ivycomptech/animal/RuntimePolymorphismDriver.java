package com.ivycomptech.animal;

public class RuntimePolymorphismDriver {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Animal animal1 = new Carnivores();
        Animal animal2 = new Herbivores();
        Animal animal3 = new Omnivores();
        animal.eats();
        animal1.eats();
        animal2.eats();
        animal3.eats();

    }
}
