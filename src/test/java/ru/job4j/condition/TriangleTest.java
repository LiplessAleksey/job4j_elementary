package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {

    /**
     * Проверка существования треугольника с равными сторонами.
     */
    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    /**
     * Проверка несуществования треугольника с неравными сторонами.
     */
    @Test
    void whenNotExist() {
        double ab = 1.0;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    /**
     * Проверка существования треугольника с числами с плавающей точкой.
     */
    @Test
    void whenFloatPointExist() {
        double ab = 2.5;
        double ac = 3.0;
        double bc = 4.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    /**
     * Проверка несуществования треугольника с числами с плавающей точкой.
     */
    @Test
    void whenFloatPointNotExist() {
        double ab = 1.0;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    /**
     * Проверка с числами с плавающей точкой и погрешностью.
     */
    @Test
    void whenFloatPointCloseTo() {
        float ab = 1.0000001F;
        float ac = 1.0000001F;
        float bc = 1.0000001F;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    /**
     * Проверка существования треугольника с отрицательными значениями.
     */
    @Test
    void whenNegativeValues() {
        double ab = -2.0;
        double ac = -2.0;
        double bc = -2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    /**
     * Проверка существования треугольника с нулевыми значениями.
     */
    @Test
    void whenZeroValues() {
        double ab = 0.0;
        double ac = 0.0;
        double bc = 0.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    /**
     * Проверка несуществования треугольника, когда сумма двух сторон равна третьей.
     */
    @Test
    void whenSumOfTwoSidesEqualsThird() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 7.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    /**
     * Проверка треугольника с большими значениями.
     */
    @Test
    void whenLargeNumbers() {
        double ab = Double.MAX_VALUE;
        double ac = Double.MAX_VALUE;
        double bc = Double.MAX_VALUE;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }
}