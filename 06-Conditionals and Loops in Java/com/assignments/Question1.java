// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.assignments;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Enter any number from 0 to 9: ");
            int userInput = input.nextInt();
            if (userInput == 0) {
                break;
            }
            count += userInput;
        }
        System.out.println("The Sum of all the numbers you entered is: " + count);
        input.close();
    }
}
