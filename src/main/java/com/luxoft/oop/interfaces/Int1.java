package com.luxoft.oop.interfaces;

public interface Int1 {

    int X = 100_500;

    default int m(int i) {
        System.out.println("jhgsdkjahgsfljshgfd");
        return calc(i);
    }

    @Private
    default int calc(int i) {
        return i + 7;
    }

    default int m2(int i) {
        System.out.println("jhgsd");
        return calc(i);
    }
}
