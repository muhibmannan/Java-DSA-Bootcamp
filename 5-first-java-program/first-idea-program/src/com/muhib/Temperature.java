package com.muhib;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");

        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}
