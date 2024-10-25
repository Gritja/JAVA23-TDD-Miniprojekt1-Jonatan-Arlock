package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    Main main;
    int testInputIsNegative;
    int testInputIsOutOfRange;
    int testInputIs0;
    int testInputIs1;
    int testInputIs2;
    int testInputIs10;
    @BeforeEach
    void setUp() {
        main = new Main();
        testInputIsNegative = -5;
        testInputIsOutOfRange = 1005;
        testInputIs0 = 0;
        testInputIs1 = 1;
        testInputIs2 = 2;
        testInputIs10 = 10;
    }

    @Test
    @DisplayName("Testing if the user input is a negative number.")
    public void userInput_isANegativeNumber() {
        assertFalse(main.validateInput(testInputIsNegative));
    }
    @Test
    @DisplayName("Testing if the user input is outside the specified range.")
    public void userInput_isOutOfRange() {
        assertFalse(main.validateInput(testInputIsOutOfRange));
}
    @Test
    @DisplayName("Testing if the user input is inside the specified range.")
    public void userInput_isValid() {
        assertTrue(main.validateInput(testInputIs10));
    }

@Test
@DisplayName("Testing if the user input is 0")
        public void userInput_is0() {
        assertFalse(main.validateInput(testInputIs0));
    }

@Test
@DisplayName("Testing if the user input is 1")
        public void userInput_is1() {
        assertFalse(main.validateInput(testInputIs1));
    }
@Test
    @DisplayName("Testing if the user input is a number inside the specified range.")
    public void userInput_isANumber_andValid() {
        assertTrue(main.validateInput(testInputIs10));
}
    @Test
    @DisplayName("Testing how many Prime numbers exist between 0 and 2")
    public void countPrimeNumbers_ifUserInputIs_2() {
        assertEquals(1, main.countPrimes(testInputIs2));
    }
    @Test
    @DisplayName("Testing how many Prime numbers exist between 0 and 10")
    public void countPrimeNumbers_ifUserInputIs_10() {
        assertEquals(4, main.countPrimes(testInputIs10));
    }
    @Test
    @DisplayName("Testing how many Prime numbers exist between 0 and 10")
    public void sumPrimeNumbers_ifUserInputIs_2() {
        assertEquals(2, main.sumPrimes(testInputIs2));
    }

    @Test
    @DisplayName("Testing how many Prime numbers exist between 0 and 10")
    public void sumPrimeNumbers_ifUserInputIs_10() {
        assertEquals(17, main.sumPrimes(testInputIs10));
    }

    @Test
    @DisplayName("Test if text output is displaying the correct amount of prime numbers")
    public void userInputIs10_displayCorrectCount() {

        assertEquals (4, main.countPrimes(testInputIs10));
    }
    @Test
    @DisplayName("Test if text output is displaying the correct amount of prime numbers")
    public void userInputIs10_displayCorrectSum() {

        assertEquals (17, main.sumPrimes(testInputIs10));
    }

}