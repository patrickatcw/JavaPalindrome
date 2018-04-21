package com.me;

/*
directions;
- create a program where the user inputs the number of palindromes they would like would like to see returned,
then return that physical number of palindromes in the output.
ex. if the user puts in the number "3", then the output would be;
0, 1, 2
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //IsNumber.isActualNumber();

        /*int n, b, rev = 0;
        int limit=50;
        System.out.print("Palindrome numbers from 1 to N:");
        for (int i = 1; i <= limit; i++)
        {
            n = i;
            while (n > 0)
            {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if (rev == i)
            {
                System.out.print(i + " ");
            }
            rev = 0;
        }*/

        Scanner sc = new Scanner(System.in);
        int n, b, rev = 0;
        //int limit = 0;

        System.out.print("Please put in the number of palindromes you would like to see " +
                "returned, then press enter;\n");

        int input = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= input; i++)
        {
            n = i;
            while (n > 0)
            {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if (rev == i)
            {
                System.out.print(i + " ");
            }
            rev = 0;
        }

    }
    
}
