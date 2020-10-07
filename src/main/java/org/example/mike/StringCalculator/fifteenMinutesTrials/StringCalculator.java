package org.example.mike.StringCalculator.fifteenMinutesTrials;

public class StringCalculator {
    public int sum(String input) {
        boolean emptyInput = input.isEmpty();
        if(emptyInput == true){
            return 0;
        }
        if(emptyInput == false){
            if(input.contains(",")){
                String[] arrayStringsGetallen = input.split(",");
                int sum = 0;
                for(String getalAlsString : arrayStringsGetallen){
                    int getal = Integer.parseInt(getalAlsString);
                    sum = sum + getal;
                }
                return sum;
            }
            else{
                return Integer.parseInt(input);
            }
        }
        throw new NotYetImplementedException("Not yet implemented");
    }
}
