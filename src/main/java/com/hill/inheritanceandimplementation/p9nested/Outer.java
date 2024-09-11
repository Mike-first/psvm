package com.hill.inheritanceandimplementation.p9nested;

public class Outer {
    public static String outerStaticString = "Outer.staticString";
    public String outerNonStaticString = "Outer.nonStaticString";

    public void doSmth() {
        System.out.println(new Inner().nonStaticString);
        System.out.println(new Outer().outerNonStaticString);
        System.out.println(Outer.outerStaticString);
        System.out.println();
    }


    public class Inner {
//        public static String staticString = "staticString"; //java 16+
//        public static void doItStatic() {}

        public String nonStaticString = "Inner.nonStaticString";

        public void doIt() {
            System.out.println(outerStaticString);
            System.out.println(outerNonStaticString);
        }


    }


    public static class Nested {
        public static String nestedStaticString = "Nested.staticString";
        public String nestedNonStaticString = "Nested.nonStaticString";

        public void doIt() {
            System.out.println(outerStaticString);
//            System.out.println(outerNonStaticString); //no access
        }
    }
}
