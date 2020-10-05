package org.example.mike.StringCalculator.fifteenMinutesTrials;

public class StringCalculatorDayOneOctoberFive {

    int sum(String input){
        if(input == "" ){
            return 0;
        }
        if(!input.isEmpty()){
            return Integer.parseInt(input);
        }
        if(input.contains(",")){
            String numberOne = input.substring(0,input.indexOf(","));
            String numberTwo
        }

        throw new NotYetImplementedException("Not yet implemented.");
    }
}
