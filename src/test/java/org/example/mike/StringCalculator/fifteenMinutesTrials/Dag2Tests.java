package org.example.mike.StringCalculator.fifteenMinutesTrials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Dag2Tests {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void emptyStringReturnZero(){
        String input = "";
        int result = stringCalculator.sum(input);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void oneNumberStringReturnNumber(){
        String input = "4";
        int result = stringCalculator.sum(input);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void twoNumbersStringReturnSum(){
        String input = "4,3";
        int result = stringCalculator.sum(input);
        assertThat(result).isEqualTo(7);
    }


}
