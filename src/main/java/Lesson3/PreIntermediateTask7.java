package Lesson3;

import java.util.Arrays;

public class PreIntermediateTask7 {


    public static void main(String[] args) {

        System.out.println("7. Given an array of integers. Write a method which finds max and min elements in it and\n" +
                "multiplies them by 2");

        int[] myArray = {1,4,10,10,25,5,20,100};

        System.out.println("\nResult of multiplication of max array element by 2 is " + Calc2.maxElementMultiplication(myArray));
        System.out.println("\nResult of multiplication of min array element by 2 is " + Calc2.minElementMultiplication(myArray));

}}

class Calc2 {



    public static int maxElementMultiplication (int[] array) {

        Arrays.sort(array);
        int max = array[array.length-1];
        return max=max*2;
    }

    public static int minElementMultiplication (int[] array) {
        Arrays.sort(array);
        int min = array[0];
        return  min = min * 2;

    }


}