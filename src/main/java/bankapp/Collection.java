package bankapp;

import lombok.Getter;

public class Collection<T> {

    public static final int DEFAULT_SIZE = 16;

    @Getter
    private T[] objects;

    public Collection() {
        //noinspection unchecked
        this((T[]) new Object[DEFAULT_SIZE]);
    }

    private int counter;

    @SuppressWarnings("WeakerAccess")
    @SafeVarargs
    public Collection(T... objects) {
        this.objects = objects;
        counter = objects.length - 1;
    }

    public void add(T o) {
        if (counter >= objects.length)
            //noinspection unchecked
            objects = (T[]) new Object[
                    Math.round(objects.length * 1.5f)];

        objects[counter++] = o;
    }

    // TODO: 21/11/2017 remove, insert,...
}
