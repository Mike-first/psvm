//abstract class vs interface
//1. single inheritance, multiple implementation
//2. class fields may not be static, public or final, all fields of an interface are ONLY public static final
//3. a class can implement methods, an interface cannot, but it is worth mentioning the default implementations that appeared with V1.8
//4. based on point 2, an interface cannot have states (variables), only constants and cannot have private methods. an abstract class can
//diamond problem - see Child1
//inheritance of private members.
//Parent has private int x. is this field in the Child2 object? yes, it is. you can see it in the debugger
//how to access this field in Child2? public int getX() is inherited in Child2 and can be called.
//what exactly will public int getX() return in Child2? the value of the field. if it was not defined, then by default.

package com.hill.inheritanceandimplementation.p2privatememberinheritance;

public class Test {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        BClass bClass = new BClass();
        //the result is obvious
        aClass.method();
        bClass.method();

        BClass bClass1 = new BClass();
        bClass1.method();
        bClass1.newMethod();
        AClass aClass1 = bClass1;
        aClass1.method();
        //строка ниже не скомпилируется потому что мы положили класс-наследник по ссылке родительского класса,
        //а значит и работать с ним должны как с родительским. проще говоря, если из ведра перелить в чашку,
        //то все, что в чашку не влезло, потеряется.
        //aClass1.newMethod();
        // в отличие от примера из жизни, мы еще можем вернуть все содержимое ведра
        //для этого нужно присвоиться ссылке ведра с кастованием к ведру.
        BClass bClass2 = (BClass) aClass1;
        bClass2.method();
        bClass2.newMethod();

        System.out.println(aClass.getX());
        System.out.println(bClass.getX());
        bClass.setX(5);
        System.out.println(aClass.getX());
        System.out.println(bClass.getX());
    }
}
