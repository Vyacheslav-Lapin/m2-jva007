package com.luxoft.oop;

import java.util.Objects;

public class TypicalObject implements Cloneable {

    private int x;
    private int y;

    private static int counter;

    public TypicalObject(int x, int y) {
        this.x = x;
        this.y = y;
        counter++;
    }

    public static void main(String... args) {
        TypicalObject typicalObject =
                new TypicalObject(1, 2);

        System.out.println(
                typicalObject.equals(
                        new TypicalObject(1, 2)));

        System.out.println(counter);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypicalObject)) return false;
        TypicalObject that = (TypicalObject) o;
        return getX() == that.getX() &&
                getY() == that.getY();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "TypicalObject{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
