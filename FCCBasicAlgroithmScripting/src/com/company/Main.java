package com.company;

/**
 * <h1>freeCodeCamp Basic Algorithm Scripting in Java</h1>
 *
 * <p>Converting the FCC challenges from JavaScript to Java.</p>
 *
 * <br>
 *
 * @since 26/6/2021
 * @author John Gillard
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Convert Celsius to Fahrenheit");
        System.out.printf("24.00°F = %.2f°C\n", Challenge.celsiusToFarenheit(24));

        System.out.println("\nReverse a String");
        System.out.printf("hello -> %s\n", Challenge.reverseString("hello"));
    }
}
