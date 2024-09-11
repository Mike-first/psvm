//Factory Method
//allows the creation of new objects to be delegated from the base class to the heir classes
//makes the system extensible

//in this example, we need builders who can build, but what to build is not yet clear
//that's why all builders have a common interface and its implementations, which are returned by factories, and they also have a common interface
//also, a spacer class has been added that returns a factory depending on what needs to be built
//as a result, we get a builder in the client code that can build something without using the word new
//which means we can add as many new builders as we like (expand the system) without changing the client code

package com.hill.pattern.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        Factory factory = Gap.giveFactory(Gap.Type.ALGORITHM);
        Builder builder = factory.create();
        builder.build();
    }
}
