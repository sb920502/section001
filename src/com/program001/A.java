package com.program001;

class A {
    private static final A instance = new A();

    private A() {
    }

    public static A getInstance() {
        return instance;
    }
}
