package org.simplejava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SimpleClassTest {

    SimpleClass simpleObj;

    @BeforeEach
    void setUp() {
        simpleObj = new SimpleClass();
    }
    @Test
    void simpleTest1() {
        Collection list = simpleObj.stringAsCollection("A", "V", "C");

        assertNotNull(list);
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
    }

    @Test
    void simpleTest2() {
        assertThrows(NullPointerException.class, () -> {
            Collection list = simpleObj.stringAsCollection(null);
        });
    }


}