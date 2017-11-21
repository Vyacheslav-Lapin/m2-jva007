package com.luxoft.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.experimental.var;
import lombok.val;

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

    @SneakyThrows
    public void setX(int x) {
//        this.x = x;
        val xField = TypicalObject.class
                .getDeclaredField("x");
        xField.setAccessible(true);
        xField.set(this, x);

        var x1Field = TypicalObject.class
                .getDeclaredField("x");
        x1Field = TypicalObject.class
                .getDeclaredField("x");
    }
}
