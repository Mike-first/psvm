package com.hill.inheritanceandimplementation.p4abstractclassinstance;

//an abstract class implementing an interface is not required to implement its methods
//but a concrete class inheriting this class must implement all abstract methods of the abs class + interface

public abstract class Abs implements Inter {
    protected static String s = "static abs class string";
    protected String s2 = "non-static abs class string";

}
