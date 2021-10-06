package com.luisuriel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(121));
    }
}
