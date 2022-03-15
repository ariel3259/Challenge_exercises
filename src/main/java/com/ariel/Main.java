package com.ariel;

import java.util.Scanner;

public class Main {


    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
/*      ChallengeAlgorithms exercises = new ChallengeAlgorithms();
// Exercise one
        int number = 0;

        //Inserts a number by keyboard
        System.out.println("Insert a number");
        number = Integer.parseInt(exercises.scan.next());

        if(!exercises.isACousinNumber(number)){
            System.out.println( number+" is not a cousin number");
            return;
        }
        System.out.println(number+" is a cousin number");
*/

/*    Exercise two
        String password = "";
        System.out.println("Insert your password");
        password = exercises.scan.next();
        boolean result = exercises.isTruePassword(password);
        if(!result){
            System.out.println("you have to train your memory");
        }
        System.out.println("Congratulations, you will remember you password ");
 */

/*
        //Exercise three
        String employeeName;
        int yearsOfWork;
        int hoursOfWork;
        double employeeValue;
        double amountEmployee;

        //Insert employee name by keyboard
        System.out.println("Insert employee name");
        employeeName = exercises.scan.next();

        //Insert years of work by keyboard
        System.out.println("Insert years of work");
        yearsOfWork = Integer.parseInt(exercises.scan.next());

        //Insert hours of works by keyboard
        System.out.println("Insert hours of work(per month)");
        hoursOfWork = Integer.parseInt(exercises.scan.next());

        //Insert employee value by keyboard
        System.out.println("Insert employee price(per hour)");
        employeeValue = Double.parseDouble(exercises.scan.next());

        amountEmployee = exercises.getAmountEmployee(employeeValue, hoursOfWork, yearsOfWork);

        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee antiquity: "+ yearsOfWork);
        System.out.println("Employee amount: "+ amountEmployee);
 */

        /*
        // Exercise 4
        double random = Math.floor(Math.random()*1001);

        exercises.findRandomNumber(random);
         */

        /*
        //Exercise 5
        int number;

        System.out.println("Insert a number");
        number = Integer.parseInt(exercises.scan.next());

        exercises.setNumbers(number);
         */


        //Challenge POO

        Password password = new Password();


        System.out.println("Insert password");
        password.setPassword(scan.next());

        System.out.println(password.isStrong()? "Your password is strong" : "Your password is weak");

    }



}
