package com.twu.mommy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyTest {

    private Mommy mommy;

    @Before
    public void setUp() throws Exception {
        mommy = new Mommy();
    }

    @Test
    public void shouldPrintKWhenMommyK() {
        assertEquals("k", mommy.runMommy("k"));
    }

    @Test
    public void shouldPrintKRWhenMommyKR() throws Exception {
        assertEquals("kr", mommy.runMommy("kr"));
    }

    @Test
    public void shouldPrintMommyWhenMommyA() throws Exception {
        assertEquals("mommy", mommy.runMommy("a"));
    }

    @Test
    public void shouldPrintHmommysWhenMommyHis() throws Exception {
        assertEquals("hmommys", mommy.runMommy("his"));
    }
}
