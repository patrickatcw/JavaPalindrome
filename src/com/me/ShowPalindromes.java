package com.me;

import java.util.Scanner;

public class ShowPalindromes {

    public static void display (){

        Scanner sc = new Scanner(System.in);
        int n, b, rev = 0;

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
