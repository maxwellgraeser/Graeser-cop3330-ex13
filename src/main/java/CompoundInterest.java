/*
 *  UCF COP3330 Fall 2021 Exercise 10 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();
        System.out.print("Enter the interest rate: ");
        double ratePercentage = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        System.out.print("Enter the number of times your interest is compounded per year: ");
        int compound = scan.nextInt();

        double rate = ratePercentage / 100;
        double finalAmount = principal * Math.pow(1 + (rate / compound), compound * years);

        System.out.println(String.format("After %d years at %.2f percent interest compounded %d times per year, $%.2f will be worth $%.2f", years, ratePercentage, compound, principal, finalAmount));
    }
}