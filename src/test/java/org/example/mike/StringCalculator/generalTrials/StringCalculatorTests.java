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

    @Test
    void inputNumbers2And3ReturnSum5(){
        String twoNumberString = "2,3";
        int testResult = stringCalculator.sum(twoNumberString);
        int expectedResult = 5;
        assertThat(testResult).isEqualTo(expectedResult);
    }

    @Test
    void inputThreeNumbersAndReturnSum(){
        String threeNumberString = "2,3,4";
        int testResult = stringCalculator.sum(threeNumberString);
        int expectedResult = 9;
        assertThat(testResult).isEqualTo(expectedResult);
    }

    @Test
    void inputFiveNumbersAndReturnSum(){
        String fiveNumberString = "2,3,4,1,1";
        int testResult = stringCalculator.sum(fiveNumberString);
        int expectedResult = 11;
        assertThat(testResult).isEqualTo(expectedResult);
    }


    @Test
    void inputTwoNumbersSeperatedByOtherGivenDelimiterAndReturnSum(){
        String twoNumberStringSeperatedByOtherInput = "1\\n2";
        int testResult = stringCalculator.sum(twoNumberStringSeperatedByOtherInput);
        int expectedResult = 3;
        assertThat(testResult).isEqualTo(expectedResult);
    }

}
