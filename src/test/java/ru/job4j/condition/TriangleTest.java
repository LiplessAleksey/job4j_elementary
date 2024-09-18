package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    /**
     * Проверка существования треугольника с равными сторонами
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
     * Проверка несуществования треугольника с неравными сторонами
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
     * Проверка существования треугольника с числами с плавающей точкой
     */
    @Test
    void whenFloatPoint() {
        double ab = 2.5;
        double ac = 3.0;
        double bc = 4.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    /**
     * Проверка несуществования треугольника с числами с плавающей точкой
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
     * Проверка существования треугольника с отрицательными значениями
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
     * Проверка существования треугольника с нулевыми значениями
     */
    @Test
    void whenZeroValues() {
        double ab = 0.0;
        double ac = 0.0;
        double bc = 0.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}