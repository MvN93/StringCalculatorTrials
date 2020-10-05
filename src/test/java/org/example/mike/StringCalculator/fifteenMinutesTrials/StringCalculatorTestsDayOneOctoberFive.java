package org.example.mike.StringCalculator.fifteenMinutesTrials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTestsDayOneOctoberFive {

    StringCalculatorDayOneOctoberFive stringCalculator;

    @BeforeEach
    void setUp(){
        stringCalculator = new StringCalculatorDayOneOctoberFive();
    }

    @Test
    void inputEmptyStringReturnZero(){
        String input = "";
        int sum = stringCalculator.sum(input);
        System.out.println(sum);
    }

    @Test
    void inputOneNumberReturnThatNumber(){
        String input = "15";
        int sum = stringCalculator.sum(input);
        System.out.println(sum);
    }

    @Test
    void inputTwoNumbersReturnSum(){
        String input = "1,5";
        int sum = stringCalculator.sum(input);
        System.out.println(sum);
    }
}
