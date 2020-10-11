package org.example.mike.StringCalculator.generalTrials;


import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCalculator {
    private static final int EMPTY_STRING_SUM = 0;
    private static final String DEFAULT_DELIMITER = ",";

    public int sum(String input) {
        boolean emptyInput = input.isEmpty();

        if(emptyInput == true){
            return EMPTY_STRING_SUM;
        }
        if(emptyInput == false){
            //if delimiter is given use that, else default
            if(input.startsWith("//") == true){
                String numberSeperator = "\\n";
                String[] delimiterStringAndNumbersString = input.split(Pattern.quote(numberSeperator), 2); //makes 2 substrings;
                String delimiter = delimiterStringAndNumbersString[0].substring(2,delimiterStringAndNumbersString.length + 1);
                String numbersString = delimiterStringAndNumbersString[1];

                String[] arrayOfSeperatedNumbersByGivenDelimiter = numbersString.split(delimiter);

                int sum = determineSumArray(arrayOfSeperatedNumbersByGivenDelimiter);
                return sum;
            }
            else if(input.contains(DEFAULT_DELIMITER) || input.contains("\\n")){
                String[] arrayOfSeperatedNumbersByOnlyFirstDelimiter = input.split(DEFAULT_DELIMITER);

                ArrayList<String> arrayOfSeperatedNumbersByBothDelimiters = new ArrayList<String>();

                for (String seperatedString : arrayOfSeperatedNumbersByOnlyFirstDelimiter){
                    String seperator = "\\n";

                    String[] arrayOfSeperatedStringSeperatedBySecondDelimiter = seperatedString.split(Pattern.quote(seperator));

                    for(String seperatedNumberAsString : arrayOfSeperatedStringSeperatedBySecondDelimiter){
                        arrayOfSeperatedNumbersByBothDelimiters.add(seperatedNumberAsString);
                    }
                }

                int sum = determineSumArrayList(arrayOfSeperatedNumbersByBothDelimiters);
                return sum;
            }
            else{
                int inputAsNumber = Integer.parseInt(input);
                return inputAsNumber;
            }

        }

        throw new NotYetImplementedException("This functionality is not yet implemented.");
    }

    private int determineSumArray(String[] numbersAsStrings){
        int sum = 0;

        for (String seperatedNumberAsString : numbersAsStrings){
            int seperatedNumber = Integer.parseInt(seperatedNumberAsString);
            sum = sum + seperatedNumber;
        }

        return sum;
    }

    private int determineSumArrayList(ArrayList<String> numbersAsStrings){
        int sum = 0;

        for (String seperatedNumberAsString : numbersAsStrings){
            int seperatedNumber = Integer.parseInt(seperatedNumberAsString);
            sum = sum + seperatedNumber;
        }

        return sum;
    }

    public static int getEmptyStringSum(){
        return EMPTY_STRING_SUM;
    }



}
