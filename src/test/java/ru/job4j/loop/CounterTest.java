package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CounterTest {
    @Test
    @DisplayName("Start > Finish")
    void whenStart2ToFinish1Then0() {
        int start = 2;
        int finish = 1;
        int expected = 0;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = 1, Finish = 2")
    void whenStart1ToFinish2Then3() {
        int start = 1;
        int finish = 2;
        int expected = 3;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = 0, Finish = 10")
    void whenStart0ToFinish10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = 3, Finish = 8")
    void whenStart3ToFinish8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = 1, Finish = 1")
    void whenStart1ToFinish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = -5, Finish = 5")
    void whenStartNegative5ToFinish5Then0() {
        int start = -5;
        int finish = 5;
        int expected = 0;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Start = -10, Finish = -5")
    void whenStartNegative10ToFinishNegative5ThenMinus45() {
        int start = -10;
        int finish = -5;
        int expected = -45;
        assertThat(expected).isEqualTo(Counter.sum(start, finish));
    }

    @Test
    @DisplayName("Sum = 30: Start = 1, Finish = 10")
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Sum = 0: Start = -10, Finish = 10")
    void whenSumEvenNumbersFromNegativeTenToTenThenZero() {
        int start = -10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Sum = 10: Start = 10, Finish = 10")
    void whenSumEvenNumbersFrom10To10ThenTen() {
        int start = 10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}