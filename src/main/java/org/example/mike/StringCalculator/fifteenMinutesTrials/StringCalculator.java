package org.example.mike.StringCalculator.fifteenMinutesTrials;

public class StringCalculator {
    public int sum(String input) {
        boolean emptyStringInput = input.isEmpty();
        if(emptyStringInput == true){
            return 0;
        }
        else if(emptyStringInput == false){
            if(input.contains(",")){
                String[] numbers = input.split(",");
                int sum;
                int getal0 = Integer.parseInt(numbers[0]);
                int getal1 = Integer.parseInt(numbers[1]);
                sum =  getal0 + getal1;
                return sum;
            }
            else{
                return Integer.parseInt(input);
            }
        }
        throw new NotYetImplementedException("Not yet implemented");
    }
}
