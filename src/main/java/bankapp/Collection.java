package bankapp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Collection {

    public static final int DEFAULT_SIZE = 10;

    @Getter
    private Object[] objects;

    public Collection() {
        this(new Object[DEFAULT_SIZE]);
    }

    private int counter;

    public Collection(Object... objects) {
        this.objects = objects;
        counter = objects.length - 1;
    }

    public void add(Object o) {
        if (counter >= objects.length)
            objects = new Object[
                    Math.round(objects.length * 1.5f)];

        objects[counter++] = o;
    }

    // TODO: 21/11/2017 remove, insert,...
}
