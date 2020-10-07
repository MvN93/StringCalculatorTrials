package org.example.mike.StringCalculator.generalTrials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTests {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void emptyStringInputReturnsZero(){
        String emptyString = "";
        int testResult = stringCalculator.sum(emptyString);
        int expectedResult = StringCalculator.getEmptyStringSum();
        assertThat(testResult).isEqualTo(expectedResult);
    }

    @Test
    void singleNumber2InputReturn2AsSum(){
        String singleNumberString = "2";
        int testResult = stringCalculator.sum(singleNumberString);
        int expectedResult = 2;
        assertThat(testResult).isEqualTo(expectedResult);
    }
}
