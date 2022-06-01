package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.data.DataGenerator;

public class AppTest {

    @Test
    void shouldGet() {
        System.out.println(DataGenerator.getLongCardNumber());
        System.out.println(DataGenerator.getShortCardNumber());
        System.out.println(DataGenerator.getCardNumberFromSymbols());
        System.out.println(DataGenerator.getCardNumberFromLetters());
        System.out.println(DataGenerator.getValidMonth());
        System.out.println(DataGenerator.getValidYear());
        System.out.println(DataGenerator.getYearFromSymbols());
        System.out.println(DataGenerator.getYearWithZeroes());
        System.out.println(DataGenerator.getDistantFutureYear());
        System.out.println(DataGenerator.getOneDigitYear());
        System.out.println(DataGenerator.getPastYear());
        System.out.println(DataGenerator.getDigitsForName());
    }
}
