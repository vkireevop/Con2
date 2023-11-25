package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void testDoForPositive() {
        int result = Converter.Do(40.5f);
        assertEquals(1000, result);
    }

    @Test
    public void testDoForFiniteNumber() {
        int result = Converter.Do(42.9f);
        assertEquals(42, result);
    }

    @Test
    public void testDoForNegative() {
        assertThrows(IllegalArgumentException.class, () -> Converter.Do(29f));
    }

    @Test
    public void testDoForNumberMinus5() {
        int result = Converter.Do(-42.5f);
        assertEquals(-47, result);
    }

    @Test
    public void testDoForNegativeNaN() {
        int result = Converter.Do(17.3f);
        assertEquals(-2000, result);
    }

    @Test
    public void testDoForNumberWithMultipleDecimals() {
        assertThrows(IllegalArgumentException.class, () -> Converter.Do(29.23123f));
    }
}
