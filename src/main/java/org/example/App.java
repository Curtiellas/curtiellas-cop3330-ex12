package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        float principal = sc.nextFloat();

        System.out.println("Enter the rate of interest: ");
        float rate = sc.nextFloat();

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();

        //calculate
        float value = principal * (1 + (rate / 100) * years);

        System.out.printf( "After %d years at %.1f%%, the investment will be worth $%.0f.", years, rate, value );
    }
}
