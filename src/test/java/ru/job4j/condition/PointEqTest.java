package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointEqTest {

    /**
     * Проверка на равенство координат
     */
    @Test
    void whenCoordinatesAreEqual() {
        boolean result = PointEq.eq(10, 10, 10, 10);
        assertThat(result).isTrue();
    }

    /**
     * Проверка на неравенство координат
     */
    @Test
    void whenCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(1, 1, 2, 2);
        assertThat(result).isFalse();
    }

    /**
     * Проверка на равенство координат с отрицательными значениями
     */
    @Test
    void whenNegativeCoordinatesAreEqual() {
        boolean result = PointEq.eq(-10, -10, -10, -10);
        assertThat(result).isTrue();
    }

    /**
     * Проверка на неравенство координат с отрицательными значениями
     */
    @Test
    void whenNegativeCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(-1, -1, -2, -2);
        assertThat(result).isFalse();
    }

    /**
     * Проверка на равенство координат с нулевыми значениями
     */
    @Test
    void whenZeroCoordinatesAreEqual() {
        boolean result = PointEq.eq(0, 0, 0, 0);
        assertThat(result).isTrue();
    }

    /**
     * Проверка на неравенство координат с нулевыми значениями
     */
    @Test
    void whenZeroCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(0, 0, 1, 1);
        assertThat(result).isFalse();
    }
}