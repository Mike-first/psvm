// Joshua Bloch's method
// The following methods can be applied to Enum:
// name(), ordinal(), equals(), hashCode(), toString(), finalize(), clone(), values(), valueOf()
// implements the Comparable, Serializable interface
// since B.5, the abstract class Enum has appeared
// if you add a constant to enum, you will get a multitone

package com.hill.pattern.creational.singleton;

public class Singleton6 {
    public enum Singleton {
        INSTANCE(100, "EnumSingleton");
        private int value;
        private String name;


        //constructor for enum constant

        Singleton(int i, String name) {
            this.value = i;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Singleton{" +
                    "value=" + value +
                    ", name='" + name + '\'' +
                    '}';
        }

    }
}
