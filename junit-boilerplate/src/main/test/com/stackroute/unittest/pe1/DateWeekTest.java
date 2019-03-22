package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateWeekTest {

    @Test
    public void getdate() {
        assertEquals("24/11/2018 30/11/2018",DateWeek.getdate());
    }
}