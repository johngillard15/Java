package com.company;

public class Challenge {
    // Convert Celsius to Fahrenheit
    public static double celsiusToFarenheit(double celsius){
        return celsius * 9/5 + 32;
    }

    // Reverse a String
    public static String reverseString(String str){
        StringBuilder strReverse = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
            strReverse.append(str.charAt(i));

        return strReverse.toString();
    }

    // Factorialize a Number

    // Find the Longest Word in a String

    // Return Largest Numbers in Arrays

    // Confirm the Ending

    // Repeat a String Repeat a String

    // Truncate a String

    // Finders Keepers

    // Boo who

    // Title Case a Sentence

    // Slice and Splice

    // Falsy Bouncer

    // Where do I Belong

    // Mutations

    // Chonky Monkey
}
