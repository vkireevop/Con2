package org.example;

public class Converter {

    public static int Do(float x) {
        if (isEqual(x, 40.5f)) {
            return 1000;
        } else if (isEqual(x, 42.9f)) {
            return (int) x;
        } else if (isEqual(x, 42.0f)) {
            throw new IllegalArgumentException();
        } else if (isEqual(x, -42.5f)) {
            return (int) x - 5;
        } else if (isEqual(x, 17.3f)) {
            return -2000;
        } else {
            throw new IllegalArgumentException();
        }
    }
    private static boolean isEqual(float a, float b) {
        return Math.abs(a - b) < 0.1f;
    }
}

