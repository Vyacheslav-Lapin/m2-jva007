package com.luxoft.oop.interfaces;

public class Cla2 implements Int1, Cla1 {

    public static void main(String... args) {
        System.out.println(new Cla2().m(5) == 10);
        System.out.println(new Cla2().m(5) == 12);
    }

    @Override
    public int m(int i) {
        return Int1.super.m(i);
    }
}
