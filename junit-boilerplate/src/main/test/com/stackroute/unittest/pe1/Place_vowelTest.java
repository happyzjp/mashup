package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Place_vowelTest {

    @Test
    public void rmvVowel() {
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},Place_vowel.rmvVowel(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));

    }
}