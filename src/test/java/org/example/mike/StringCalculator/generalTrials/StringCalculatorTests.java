package org.example.mike.StringCalculator.generalTrials;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTests {

    @Test
    void emptyStringInputReturnsZero(){
        StringCalculator stringCalculator = new StringCalculator();
        String emptyString = "";
        int testResult = stringCalculator.sum(emptyString);
        int expectedResult = 0;
        assertThat(testResult).isEqualTo(expectedResult);
    }
}
