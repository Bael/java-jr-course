package com.github.bael.course.unit2.examples.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {
    @Test
    public void testInterfaceClashing() {

        Tank t = new Tank();
        t.getAttackLevel();
    }
}