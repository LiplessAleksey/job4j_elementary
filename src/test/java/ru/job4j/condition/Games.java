package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GamesTest {

    /**
     * По заданию из раздела Тестирование воспользовался ChatGPT
     * Тест проверяет, что если есть разрешение и есть деньги, то можно идти в компьютерный клуб.
     */
    @Test
    void whenAllowAndHasMoneyThenCanGo() {
        /**
         * Подготавливаем вывод в консоль для перехвата
         */
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        /**
         * Запускаем тестируемый метод
         */
        Games.permission(true, true);

        /**
         * Проверяем, что вывод соответствует ожидаемому
         */
        assertEquals("I can go to the computer club." + System.lineSeparator(), output.toString());
    }

    /**
     * Тест проверяет, что если есть разрешение, но нет денег, то нельзя идти в компьютерный клуб.
     */
    @Test
    void whenAllowAndNoMoneyThenCantGo() {
        /**
         * Подготавливаем вывод в консоль для перехвата
         */
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        /**
         * Запускаем тестируемый метод
         */
        Games.permission(true, false);

        /**
         * Проверяем, что вывод соответствует ожидаемому
         */
        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }

    /**
     * Тест проверяет, что если нет разрешения, но есть деньги, то нельзя идти в компьютерный клуб.
     */
    @Test
    void whenNoAllowAndHasMoneyThenCantGo() {
        /**
         * Подготавливаем вывод в консоль для перехвата
         */
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        /**
         * Запускаем тестируемый метод
         */
        Games.permission(false, true);

        /**
         * Проверяем, что вывод соответствует ожидаемому
         */
        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }

    /**
     * Тест проверяет, что если нет разрешения и нет денег, то нельзя идти в компьютерный клуб.
     */
    @Test
    void whenNoAllowAndNoMoneyThenCantGo() {
        /**
         * Подготавливаем вывод в консоль для перехвата
         */
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        /**
         * Запускаем тестируемый метод
         */
        Games.permission(false, false);

        /**
         * Проверяем, что вывод соответствует ожидаемому
         */
        assertEquals("I can't." + System.lineSeparator(), output.toString());
    }
}