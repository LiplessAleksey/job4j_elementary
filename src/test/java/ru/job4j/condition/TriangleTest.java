package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 1.0;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenFloatPointExist() {
        double ab = 2.5;
        double ac = 3.0;
        double bc = 4.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenFloatPointNotExist() {
        double ab = 1.0;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenFloatPointCloseTo() {
        float ab = 1.0000001F;
        float ac = 1.0000001F;
        float bc = 1.0000001F;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeValues() {
        double ab = -2.0;
        double ac = -2.0;
        double bc = -2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenZeroValues() {
        double ab = 0.0;
        double ac = 0.0;
        double bc = 0.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenSumOfTwoSidesEqualsThird() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 7.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenLargeNumbers() {
        double ab = Double.MAX_VALUE;
        double ac = Double.MAX_VALUE;
        double bc = Double.MAX_VALUE;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }
}