package com.ariel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChallengeAlgorithms {
    Scanner scan = new Scanner(System.in);

    //Exercises one
    //A functions that needs a number as param and returns a boolean
    public boolean isACousinNumber(int number){
        int divisor = 2;

        //cousin boolean storages the  result of the condiconal
        boolean cousin = ( number == 1) ? false : true;

        //A loop that repeat when cousin is true and divisor is less or same than square root of number
        while(cousin && divisor <= Math.sqrt(number)){

            if(number%divisor == 0){
                cousin = false;
            }
            divisor++;
        }

        return cousin;
    }

    //Exercises two
    //Needs a password(String) as params and returns a boolean
    public boolean isTruePassword(String password ) {
        String confirmPassword = "";
        int count = 0;

        while (count < 3 && !password.equals(confirmPassword)) {

            System.out.println("Insert your password again");
            confirmPassword = scan.next();

            if (password.equals(confirmPassword)) {
                return true;
            }
            System.out.println("Wrong, try again");
            count++;
        }

        //returns false if the count is 3 and password is wrong
        return false;
    }

    //Exercise 3
    // Needs value(double), hours(int) and years(int) as params, returns a double(amount)
    public double getAmountEmployee(double value, int hours, int years ){
        double amount = value * hours;

        if(years >= 10){
            return amount +(years * 30);
        }

        return amount;
    }

    //Exercise 4
    //Needs a random number as param and returns nothing
     public void findRandomNumber(double randomNumber){
        double number = 0;

        //Loop that executes when number is not random number
        while(number != randomNumber){
            System.out.println("Find the number");
            number = Double.parseDouble(scan.next());

            //verifies if the number is lesser than random number
            if(number < randomNumber){
                System.out.println("The number is bigger");
            }

            //verifies if the number is bigger than random number
            if(number > randomNumber) {
                System.out.println("The number is smaller");
            }
        }

        System.out.println("Congratulations, you find the number");
        System.out.println("The number is: "+ number);
     }

     //Exercise 5

     public void setNumbers(int number) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(number);
        int biggestNumber = numbers.get(0);
        int smallestNumber = numbers.get(0);
        int resultOfSum = 0;
        int resultOEvenNumbers = 0;
        numbers.add(number);
        while(number != -1){
            System.out.println("Insert a number");
            number = Integer.parseInt(scan.next());
            numbers.add(number);
        }
         for (Integer integer : numbers) {
             //find the biggest and smallest number
             biggestNumber = (integer > biggestNumber) ? integer : biggestNumber;
             smallestNumber = (integer < smallestNumber) ? integer : smallestNumber;

            //sum all numbers
             resultOfSum += integer;

             //sum all even numbers
             if(integer%2 == 0){
                 resultOEvenNumbers += integer;
             }
         }

         System.out.println("Biggest number: "+ biggestNumber);
         System.out.println("Smallest number: "+ smallestNumber);
         System.out.println("Result of Sum of all numbers: "+ resultOfSum);
         System.out.println("Result of Sum of all even numbers: "+ resultOEvenNumbers);
     }
}
