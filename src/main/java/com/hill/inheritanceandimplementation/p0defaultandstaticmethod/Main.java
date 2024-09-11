//difference between static and default interface method

package com.hill.inheritanceandimplementation.p0defaultandstaticmethod;

public class Main {
    public static void main(String[] args) {
        System.out.println(Testable.getStringStatic()); //вызов статического метода от имени интерфейса
        //System.out.println(new Test().getStringStatic()); //ошибка компиляции
        System.out.println(new Test().getStringDefault()); //вызов дефолтного метода интерфейса от имени объекта класса, реализующего интерфейс
    }
}
