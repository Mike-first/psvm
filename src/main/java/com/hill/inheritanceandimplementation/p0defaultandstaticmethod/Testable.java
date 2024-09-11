package com.hill.inheritanceandimplementation.p0defaultandstaticmethod;

public interface Testable {

    static String getStringStatic() {
        return "Testable interface string static";
    }

    default String getStringDefault() {
        return "Testable interface string default";
    }
}
