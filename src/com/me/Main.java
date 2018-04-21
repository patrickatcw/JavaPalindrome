package com.me;

import java.util.Scanner;

/*
directions;

- create a program where the user inputs the number of palindromes they would like would like to see returned,
then return that physical number of palindromes in the output.
ex. if the user puts in the number "3", then the output would be;
0, 1, 2

 */

public class Main {

    public static void main(String[] args) {

        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("\nPlease put in the number of palindromes you would like to see returned, then press enter;");
        int input = Integer.parseInt(userInputScanner.nextLine());

        /*
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
                    }
            number = sc.nextInt();
                } while (number <= 0);
        System.out.println("Thank you! Got " + number);
         */



    }
}
