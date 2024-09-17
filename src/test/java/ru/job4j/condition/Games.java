package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GamesTest {

    @Test
    void whenAllowAndHasMoneyThenCanGo() {
        // Подготавливаем вывод в консоль для перехвата
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // Запускаем тестируемый метод
        Games.permission(true, true);

        // Проверяем, что вывод соответствует ожидаемому
        assertEquals("I can go to the computer club." + System.lineSeparator(), output.toString());
    }

    @Test
    void whenAllowAndNoMoneyThenCantGo() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Games.permission(true, false);

        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }

    @Test
    void whenNoAllowAndHasMoneyThenCantGo() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Games.permission(false, true);

        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }

    @Test
    void whenNoAllowAndNoMoneyThenCantGo() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Games.permission(false, false);

        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }
}