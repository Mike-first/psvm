package com.hill.inheritanceandimplementation.p3overrideandoverload;

public class Human {
    private int age;
    public String name;
    private String profession;

    public Human(int age, String name, String profession) {
        if (age < 0 | age > 150) throw new IllegalArgumentException("bad age");
        if (name == null || name.length() < 2) throw new IllegalArgumentException("bad name");
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    public Human getHuman(int age, String name, String profession) {
        return new Human(age, name, profession);
    }

    public Human getHuman(int age, String name) {
//this is an overloaded method. overloading is one of the tools of polymorphism.
//more than one method with the same name but different arguments
        return new Human(age, name, "n/a");
    }

    public Human getHuman(String profession, int age, String name) {
//the order of arguments is also important and changing it is also an overload
//it is worth saying that public Human getHuman(int age, String profession, String name) will not compile
//because the compiler sees (int, String, String), and such a set was declared in the first case
//i.e., the name of the formal variable does not matter in this case
        return new Human(age, name, profession);
    }

    public void doWork() {
        if (profession.equals("n/a") | age < 16) System.out.println("I have to get a profession first");
        else if (age > 65) System.out.println("I'm on retirement");
//here we come to the need for an abstract class, but more on that in p2
        else System.out.println("I'm doing smth");
    }

    public int getAge() {
        return age;
    }
}
