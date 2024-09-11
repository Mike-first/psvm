package com.hill.inheritanceandimplementation.p3overrideandoverload;

public class Carpenter extends Human {
    private int experience;

    //the constructor can be private to restrict the creation of class instances
    private Carpenter(int age, String name, int experience) {
        //base class constructor must be called first line in subclass constructor
        // base class must have default constructor
        super(age, name, "Carpenter");
        this.experience = experience;
    }

    public Carpenter getCarpenter(int age, String name, int experience) {
        if (age < 16) System.out.println("I'm too young");
        return new Carpenter(age, name, experience);
    }

    public int getExperience() {
        return experience;
    }

    //without annotation it also works well, but we can make a mistake in the signature and not notice it
    // with annotation the compiler will give an error
    @Override
    //this is a method override: different logic behind the same signature
    public void doWork() {
        //unlike Human.doWork(), here we know the profession exactly, so there is no need for checking
        // and the age cannot be < 16, so there is no check either
        if (this.getAge() > 65) System.out.println("I'm on retirement");
            //and the most obvious thing is that a worker of a certain profession works in a certain way
        else System.out.println("I'm building a wooden house");
    }
}
