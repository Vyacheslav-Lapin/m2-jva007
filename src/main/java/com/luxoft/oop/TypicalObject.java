package com.luxoft.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;

@Data
@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class TypicalObject {
    private final int x;

    private int y;
    private int z;
    private boolean b;

    public void setX(int x) throws NoSuchFieldException, IllegalAccessException {
//        this.x = x;
        Field xField = TypicalObject.class
                .getDeclaredField("x");
        xField.setAccessible(true);
        xField.set(this, x);
    }
}
