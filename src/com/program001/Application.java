package com.program001;

class Application {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.print(a1);
        System.out.print("\n" + a2);
    }
}
