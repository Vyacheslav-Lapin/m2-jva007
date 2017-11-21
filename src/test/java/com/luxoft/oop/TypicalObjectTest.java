package com.luxoft.oop;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Parameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class TypicalObjectTest {

    @Test
        // TODO: 21/11/2017 define
    void equalsWorksWell() throws NoSuchFieldException, IllegalAccessException {
        TypicalObject typicalObject =
                new TypicalObject(1, 2, 6, true);

        assertEquals(typicalObject,
                new TypicalObject(1, 2, 6, true));

//        assertThat(TypicalObject.counter, is(2));

        Parameter[] parameters = TypicalObject.class
                .getConstructors()[0]
                .getParameters();

        for (Parameter parameter : parameters)
            System.out.println(parameter.getName());

        typicalObject.setX(11);
        System.out.println(typicalObject);
    }
}