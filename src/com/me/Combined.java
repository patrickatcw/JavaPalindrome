package com.me;

import java.util.Scanner;

public class Combined {

    public static void both(){

        Scanner sc = new Scanner(System.in);
        int n, b, rev = 0;
        int inputNumber;

        do {
            System.out.println("Please type in the number that you would want to see how many palindromes " +
                    "exist up to, then press enter;");

            while (!sc.hasNextInt()) {
                System.out.println("That is not a number you HILLBILLY, now try again;");
                sc.next();
            }
            inputNumber = sc.nextInt();
        } while (inputNumber <= 0);
        System.out.println("Thank you! Got " + inputNumber);
        System.out.println("Here are the palindromes that exist up to " + inputNumber + "....");

        for (int i = 0; i <= inputNumber; i++)
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
