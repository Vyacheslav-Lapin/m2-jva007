package com.luxoft.oop.interfaces;

import static java.lang.System.out;

public class Cla2 implements Int1, Cla1 {

    public static void main(String... args) {
        out.println(new Cla2().m(5) == 10);
        out.println(new Cla2().m(5) == 12);
    }

    @Override
    public int m(Cla2 this, int i) {
        Cla1.m3();
//        this.main("");
        return Int1.super.m(i);
    }
}
