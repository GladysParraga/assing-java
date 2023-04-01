/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yield;

/**
 *
 * @author geovannaparraga
 */
import java.util.Scanner;

public class YieldMaturityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coupon payment: ");
        float couponPayment = scanner.nextFloat();

        System.out.print("Enter the face value: ");
        float faceValue = scanner.nextFloat();

        System.out.print("Enter the present value: ");
        float presentValue = scanner.nextFloat();

        System.out.print("Enter the years to maturity: ");
        float yearsToMaturity = scanner.nextFloat();

        float yieldMaturity = (couponPayment + ((faceValue - presentValue) / yearsToMaturity)) / ((faceValue + presentValue) / 2);

        System.out.println("The yield maturity is: " + yieldMaturity);
    }
}
