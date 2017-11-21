package com.luxoft.oop.wrappers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    private Integer i = 3;

    public static void main(String[] args) {
        BigInteger number = new BigInteger("33");
        BigInteger big = number.pow(10_000);

        Integer integer1 = Integer.valueOf(128);
        Integer integer2 = Integer.valueOf(128);
        System.out.println(integer1 == integer2);
    }

    public void doNumsNewWay() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        Integer integer = numbers.get(0);
        int num2 = new Integer(876345);
        int num = numbers.get(0).intValue();
    }
}
