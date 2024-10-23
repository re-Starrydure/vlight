package com.glimmer5;

public class Zhu {
    public static void main(String[] args) {
        Person p = new Person("微青子",19,0);
        p.eat();
        p.sleep();
        p.dadoudou();
        Person.count();

        Person b = new Person(p);
        p = null;
        b = null;
        Person.count();
    }
}
