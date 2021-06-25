package com.company;

/**
 * <h1>Pronic Number</h1>
 *
 * <a href="https://edabit.com/challenge/mMc9D6vB4iPiiAK7k">https://edabit.com/challenge/mMc9D6vB4iPiiAK7k</a>
 *
 * <p>A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers,
 * that is, a number of the form n(n + 1).
 * Create a function that determines whether a number is pronic or not.</p>
 *
 * @since 24/6/2021
 * @author John Gillard
 */

public class Main {

    public static boolean isHeteromecic(int n){
        for(int i = 0; i <= (int)Math.sqrt(n); i++){
            if(n == i * (i + 1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHeteromecic(0)); // ➞ true
        // 0 * (0 + 1) = 0 * 1 = 0

        System.out.println(isHeteromecic(2)); // ➞ true
        // 1 * (1 + 1) = 1 * 2 = 2

        System.out.println(isHeteromecic(7)); // ➞ false

        System.out.println(isHeteromecic(110)); // ➞ true
        // 10 * (10 + 1) = 10 * 11 = 110

        System.out.println(isHeteromecic(136)); // ➞ false

        System.out.println(isHeteromecic(156)); // ➞ true
    }
}
