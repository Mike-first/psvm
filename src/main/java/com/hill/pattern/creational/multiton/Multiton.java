//Multiton
//the maximum number of objects of such class is known in advance
//this implementation is not thread-safe. if necessary, add Double Check Locking

package com.hill.pattern.creational.multiton;

import java.util.HashMap;

public class Multiton {
    private static final HashMap<MultitonOrdinal, Multiton> instances = new HashMap<>();
    private MultitonOrdinal ordinal;

    private Multiton(MultitonOrdinal ordinal) {
        this.ordinal = ordinal;
    }

    public static Multiton getInstance(MultitonOrdinal ordinal) {
        if (!instances.containsKey(ordinal)) {
            instances.put(ordinal, new Multiton(ordinal));
        }
        return instances.get(ordinal);
    }

    @Override
    public String toString() {
        return "Multiton{" +
                "ordinal=" + ordinal +
                '}';
    }
}