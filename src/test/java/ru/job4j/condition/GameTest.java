package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {

    private void testMenu(String input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Game.menu(input);

        Assertions.assertThat(outputStream.toString()).isEqualTo(expectedOutput);
    }

    @Test
    void whenSuperMarioThenStartSuperMario() {
        testMenu("super mario", "Start - super mario\r\n");
    }

    @Test
    void whenTanksThenStartTanks() {
        testMenu("tanks", "Start - tanks\r\n");
    }

    @Test
    void whenTetrisThenStartTetris() {
        testMenu("tetris", "Start - tetris\r\n");
    }
}