package org.example.mike.StringCalculator.generalTrials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

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
    void inputTwoNumbersSeperatedByOtherDelimiterAndReturnSum(){
        String twoNumberStringSeperatedByOtherInput = "1\\n2";
        int testResult = stringCalculator.sum(twoNumberStringSeperatedByOtherInput);
        int expectedResult = 3;
        assertThat(testResult).isEqualTo(expectedResult);
    }

    @Test
    void inputThreeNumbersSeperatedByOtherDelimitersAndReturnSum(){
        String twoNumberStringSeperatedByOtherInput = "1\\n2,3";
        int testResult = stringCalculator.sum(twoNumberStringSeperatedByOtherInput);
        int expectedResult = 6;
        assertThat(testResult).isEqualTo(expectedResult);
    }
    @Test
    void inputFiveNumbersSeperatedByOtherDelimitersAndReturnSum(){
        String twoNumberStringSeperatedByOtherInput = "1\\n2,3,5\\n2";
        int testResult = stringCalculator.sum(twoNumberStringSeperatedByOtherInput);
        int expectedResult = 13;
        assertThat(testResult).isEqualTo(expectedResult);
    }

    @Test
    void testingWithSearchingIndexAndSplitting(){
        String testStringWithTwoSameSubstrings = "//;\\n1;2\\n3";
        /*
        System.out.println(testStringWithTwoSameSubstrings.indexOf("\\n"));
        System.out.println(testStringWithTwoSameSubstrings.startsWith("//"));
        String numberSeperator = "\\n";
        String[] substringsNumbersAndDelimiter = testStringWithTwoSameSubstrings.split(Pattern.quote(numberSeperator), 2);
        for(String substring : substringsNumbersAndDelimiter){
            System.out.println(substring);
            System.out.println("");
        }
        System.out.println(substringsNumbersAndDelimiter[0].substring(2,substringsNumbersAndDelimiter.length + 1));
        */
    }

    @Test
    void specifyPointCommaAsDelimiterInStringReturnSum3(){
        String twoNumbersSpecifyingPointCommaAsDelimiter = "//;\\n1;2";
        int testResult = stringCalculator.sum(twoNumbersSpecifyingPointCommaAsDelimiter);
        int expectedResult = 3;
        assertThat(testResult).isEqualTo(expectedResult);
    }

}
