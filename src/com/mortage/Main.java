package com.mortage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte monthInYear = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        long principle = scanner.nextLong();
        System.out.print("Enter Annual Interest Rate: ");
        double interest = scanner.nextDouble();
        System.out.print("Enter period in years: ");
        int period = scanner.nextInt();
        long monthlyPeriod = period * monthInYear;
        double monthlyInterest = interest/percent/monthInYear;
        double mortage = (principle * (monthlyInterest * (Math.pow(1 + monthlyInterest, monthlyPeriod))) / (Math.pow(1 + monthlyInterest, monthlyPeriod) - 1));
        NumberFormat mort = NumberFormat.getCurrencyInstance();
        String result = mort.format(mortage);
        System.out.println("Your Mortage is: " + result);

    }
}
