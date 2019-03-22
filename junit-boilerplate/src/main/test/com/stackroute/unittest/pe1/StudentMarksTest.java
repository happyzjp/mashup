package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Test
    public void graderange() {
        assertEquals(1,StudentMarks.graderange(7,new int[]{20,30,70,60,39,67,81}));
        assertEquals(0,StudentMarks.graderange(7,new int[]{20,30,70,60,391,67,81}));

    }
}