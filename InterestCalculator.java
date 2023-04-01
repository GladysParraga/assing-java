/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interest;

/**
 *
 * @author geovannaparraga
 */
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter the interest rate (as a percentage): ");
        float interestRate = sc.nextFloat() / 100;

        System.out.print("Enter the time period (in years): ");
        float timePeriod = sc.nextFloat();

        // Calculate simple interest rate
        float simpleInterest = principal * interestRate * timePeriod;

        // Calculate compound interest rate
        float compoundInterest = (float) (principal * Math.pow((1 + interestRate), timePeriod) - principal);
        
        System.out.println("Simple Interest Rate: " + simpleInterest);
        System.out.println("Compound Interest Rate: " + compoundInterest);
    }
}

