package com.glimmer3;

public class test {
    public static void main(String[] args) {
        test t1 = new test();
        String s = "hello";
        t1.append(s);
        System.out.println("main: " + s);
    }
    private void append(String s) {
        s += " world";
        System.out.println("method: " + s);
    }
}