// PrincipalAmount = 1200--------- Rate=5.4 -------------- time=2--------Ans should be 133.099
package com.assignments;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Enter the value of principal amount: ");
        Scanner input = new Scanner(System.in);

        double principalAmount = input.nextDouble();

        System.out.println("Enter the value of rate: ");
        double rate = input.nextDouble();

        System.out.println("Enter the value of time: ");
        double time = input.nextDouble();

        double amount = (principalAmount) * (Math.pow((1 + (rate / 100)), time));

        double compoundInterest = amount - principalAmount;

        System.out.println("The compound interest is: " + compoundInterest);
        input.close();
    }
}
