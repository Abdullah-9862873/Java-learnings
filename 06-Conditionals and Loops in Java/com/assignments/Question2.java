// Take integer inputs till the user enters 0 and print the largest number from all.

package com.assignments;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;

        while (true) {
            System.out.println("Enter the number from 0 to 9: ");
            int userInput = input.nextInt();
            if (userInput == 0) {
                break;
            } else {
                max = Math.max(max, userInput);
            }
        }
        System.out.println("The largest number you entered is: " + max);
        input.close();
    }
}
