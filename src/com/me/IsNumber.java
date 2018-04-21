package com.me;

import java.util.Scanner;


public class IsNumber {

    public static void isActualNumber(){

        Scanner sc = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.println("Please put in the number of palindromes you would like to see returned, " +
                    "then press enter;");

            while (!sc.hasNextInt()) {
                System.out.println("That is not a number you HILLBILLY, now try again;");
                sc.next(); // this is important!
            }
            inputNumber = sc.nextInt();
        } while (inputNumber <= 0);
        System.out.println("Thank you! Got " + inputNumber);
        System.out.println("Here are the first " + inputNumber + " number(s)" + "that are palindromes....");

    }


}

