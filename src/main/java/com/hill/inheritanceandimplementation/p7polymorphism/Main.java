
//simple example of Polymorphism

package com.hill.inheritanceandimplementation.p7polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Cat cat = new Cat();
        Dog dog = new Dog();
        animals[0] = cat;
        animals[1] = dog;
        for (Animal animal : animals) {
            animal.sound();
        }


        System.out.println("\n======\ninherited and overridden method:");
        List<Animal> animals1 = new ArrayList<>();

        Animal animal = new Animal() {
            @Override
            void sound() {
                System.out.println("some abstract sound");
            }
        };

        animals1.add(animal);
        animals1.add(new Dog());
        animals1.add(new Shepherd());
        animals1.add(new CaucasianShepherd());

        animals1.forEach(Animal::doSmth);


        System.out.println("\n======\nhidden static field:");
        animals1.forEach(a -> System.out.println(a.field));

        System.out.println("\n======\nhidden static field:");
        animals1.forEach(a -> System.out.println(a.getField()));


        System.out.println("===============\nhidden static field via getter:");
        System.out.println(animal.getField());
        System.out.println(new Dog().getField());
        System.out.println(new Shepherd().getField());
        System.out.println(new CaucasianShepherd().getField());
        System.out.println("===============\nhidden static field direct access:");
        System.out.println(animal.field);
        System.out.println(new Dog().field);
        System.out.println(new Shepherd().field);
        System.out.println(new CaucasianShepherd().field);
    }
}
