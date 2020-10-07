package org.example.mike.StringCalculator.generalTrials;


public class StringCalculator {
    private static final int EMPTY_STRING_SUM = 0;

    public int sum(String input) {
        boolean emptyInput = input.isEmpty();

        if(emptyInput == true){
            return EMPTY_STRING_SUM;
        }
        if(emptyInput == false){
            if(input.contains(",")){
                String[] arrayOfSeperatedNumbersAsStrings = input.split(",");
                int sum = 0;

                for (String seperatedNumberAsString : arrayOfSeperatedNumbersAsStrings){
                    int seperatedNumber = Integer.parseInt(seperatedNumberAsString);
                    sum = sum + seperatedNumber;
                }

                return sum;
            }
            else{
                int inputAsNumber = Integer.parseInt(input);
                return inputAsNumber;
            }

        }

        throw new NotYetImplementedException("This functionality is not yet implemented.");
    }

    public static int getEmptyStringSum(){
        return EMPTY_STRING_SUM;
    }
}
