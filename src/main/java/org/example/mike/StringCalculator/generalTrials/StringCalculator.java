package org.example.mike.StringCalculator.generalTrials;


import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCalculator {
    private static final int EMPTY_STRING_SUM = 0;

    public int sum(String input) {
        boolean emptyInput = input.isEmpty();

        if(emptyInput == true){
            return EMPTY_STRING_SUM;
        }
        if(emptyInput == false){
            if(input.contains(",") || input.contains("\\n")){
                String[] arrayOfSeperatedNumbersByOnlyFirstDelimiter = input.split(",");

                ArrayList<String> arrayOfSeperatedNumbersByBothDelimiters = new ArrayList<String>();

                for (String seperatedString : arrayOfSeperatedNumbersByOnlyFirstDelimiter){
                    String seperator = "\\n";

                    String[] arrayOfSeperatedStringSeperatedBySecondDelimiter = seperatedString.split(Pattern.quote(seperator));

                    for(String seperatedNumberAsString : arrayOfSeperatedStringSeperatedBySecondDelimiter){
                        arrayOfSeperatedNumbersByBothDelimiters.add(seperatedNumberAsString);
                    }
                }

                int sum = 0;

                for (String seperatedNumberAsString : arrayOfSeperatedNumbersByBothDelimiters){
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
