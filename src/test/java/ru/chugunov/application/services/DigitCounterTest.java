package ru.chugunov.application.services;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Andrei Chugunov
 */
public class DigitCounterTest {

    @Test
    public void should_count_digit_into_string() {
        DigitCounter digitCounter = new DigitCounter();
        int amountDigit = digitCounter.count("my brother has 12 apples and 1 cucumber");
        assertTrue(amountDigit == 3);
    }

    @Test
    public void should_return_zero_if_null_string() {
        DigitCounter digitCounter = new DigitCounter();
        int amountDigit = digitCounter.count(null);
        assertTrue(amountDigit == 0);
    }

    @Test
    public void should_return_zero_if_empty_string() {
        DigitCounter digitCounter = new DigitCounter();
        int amountDigit = digitCounter.count("");
        assertTrue(amountDigit == 0);
    }

    @Test
    public void should_count_if_not_trim_string() {
        DigitCounter digitCounter = new DigitCounter();
        int amountDigit = digitCounter.count("  This string contains 1 digit and does not was trimmed     ");
        assertTrue(amountDigit == 1);
    }

    @Test
    public void should_return_zero_if_string_does_not_contains_digits() {
        DigitCounter digitCounter = new DigitCounter();
        int amountDigit = digitCounter.count("Testing string without digits");
        assertTrue(amountDigit == 0);
    }
}
