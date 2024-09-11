//Null Object. inherits a class whose object must be returned by some method, but may return null instead of an object.
//allows you to skip null checks.
//Wikipedia considers it a behavioral pattern, but other resources do not consider it one. I think that NullPointer indicates an error and cannot be masked.
//in any case, it takes place, so it makes sense to describe it.
//This works for void methods of a real object. But what about methods that return a value?

package com.hill.pattern.behavioral.nullobject;

public class Client {
    public static void main(String[] args) {
        SomeObjectCanBeNull someObjectCanBeNull = new SomeObjectCanBeNull(0);
        //next line we will get NullPointerException if previous one we give negative argument
        someObjectCanBeNull.getInstance().printA();
    }
}
