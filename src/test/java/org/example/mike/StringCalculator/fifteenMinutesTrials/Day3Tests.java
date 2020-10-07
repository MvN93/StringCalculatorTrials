package org.example.mike.StringCalculator.fifteenMinutesTrials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day3Tests {
    StringCalculator stringCalculator;

    @BeforeEach
    void setUp(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void emptyStringReturn0(){
        String input = "";
        int sum = stringCalculator.sum(input);
        System.out.println("0?" + sum);
    }


    @Test
    void oneNumberStringReturnNumber(){
        String input = "3";
        int sum = stringCalculator.sum(input);
        System.out.println("3?" + sum);
    }

    @Test
    void twoNumbersStringReturnSum(){
        String input = "3,4";
        int sum = stringCalculator.sum(input);
        System.out.println("7?" + sum);
    }

    @Test
    void unknownManyNumbersStringReturnSum(){
        String input = "3,4,1,1,1";
        String input2 = "3,4,1,1,1,3,3";
        int sum = stringCalculator.sum(input);
        int sum2 = stringCalculator.sum(input2);
        System.out.println("10?" + sum);
        System.out.println("16?" + sum2);
    }
}
