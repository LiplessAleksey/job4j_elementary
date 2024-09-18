package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointEqTest {

    /**
     * �������� �� ��������� ���������
     */
    @Test
    void whenCoordinatesAreEqual() {
        boolean result = PointEq.eq(10, 10, 10, 10);
        assertThat(result).isTrue();
    }

    /**
     * �������� �� ����������� ���������
     */
    @Test
    void whenCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(1, 1, 2, 2);
        assertThat(result).isFalse();
    }

    /**
     * �������� �� ��������� ��������� � �������������� ����������
     */
    @Test
    void whenNegativeCoordinatesAreEqual() {
        boolean result = PointEq.eq(-10, -10, -10, -10);
        assertThat(result).isTrue();
    }

    /**
     * �������� �� ����������� ��������� � �������������� ����������
     */
    @Test
    void whenNegativeCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(-1, -1, -2, -2);
        assertThat(result).isFalse();
    }

    /**
     * �������� �� ��������� ��������� � �������� ����������
     */
    @Test
    void whenZeroCoordinatesAreEqual() {
        boolean result = PointEq.eq(0, 0, 0, 0);
        assertThat(result).isTrue();
    }

    /**
     * �������� �� ����������� ��������� � �������� ����������
     */
    @Test
    void whenZeroCoordinatesAreNotEqual() {
        boolean result = PointEq.eq(0, 0, 1, 1);
        assertThat(result).isFalse();
    }
}