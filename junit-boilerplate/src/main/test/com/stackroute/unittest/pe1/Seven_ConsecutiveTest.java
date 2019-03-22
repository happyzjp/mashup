package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Seven_ConsecutiveTest {

    @Test
    public void isconsecutive() {
        assertEquals("yes",Seven_Consecutive.isconsecutive(new int[]{1,2,3,4,5,6,7}));
        assertEquals("yes",Seven_Consecutive.isconsecutive(new int[]{7,6,5,4,3,2,1}));
        assertEquals("no",Seven_Consecutive.isconsecutive(new int[]{1,3,2,4,5,6,7}));
    }
}