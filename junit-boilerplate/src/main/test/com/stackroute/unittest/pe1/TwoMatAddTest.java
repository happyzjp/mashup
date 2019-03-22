package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoMatAddTest {

    @Test
    public void matadd() {
        assertArrayEquals(new int[]{4,6,8,10,12,14,16,18,20},TwoMatAdd.matadd(new int[]{1,2,3,4,5,6,7,8,9},new int[]{3,4,5,6,7,8,9,10,11},3,3));
    }
}