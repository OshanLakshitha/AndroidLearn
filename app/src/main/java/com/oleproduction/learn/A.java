package com.oleproduction.learn;

public class A {
    static int x=10;
    static class B{
        static int x=20;
    }
    static class C{
        static int x=30;
    }
    public static void main(String args[]){
        System.out.println(A.x);
        System.out.println(A.B.x);
        System.out.println(A.B.x);
    }
}

