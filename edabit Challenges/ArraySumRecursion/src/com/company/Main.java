package com.company;

/**
 * <h1>Recursion: Array Sum</h1>
 *
 * <p>Write a function that finds the sum of an array. <b>Make your function recursive.</b></p>
 * <br>
 * <b>Notes</b>
 * <li>Return 0 for an empty array.</li>
 *
 * @since 25/6/2021
 * @author John Gillard
 */

public class Main {

    public static int sum(int[] array){
        if(array.length == 1)
            return array[0];

        int[] newArr = new int[array.length - 1];

        System.arraycopy(array, 0, newArr, 0, newArr.length);

        return array[array.length - 1] + sum(newArr);
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4};

        System.out.println(sum(numArr)); // ➞ 10

        /*sum([1, 2]); // ➞ 3

        sum([1]); // ➞ 1

        sum([]); // ➞ 0*/
    }
}
