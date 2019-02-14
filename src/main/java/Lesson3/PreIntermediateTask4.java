
package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class PreIntermediateTask4 {


        public static void main(String[] args) {

        System.out.println("4. Given an array of integers. Write a method which prints the second half of the array. Include the\n" +
                "middle element to output, if the array has odd number of elements");

            ArrayList<Integer> intArray = new ArrayList<Integer>();
            intArray.add(11);
            intArray.add(25);
            intArray.add(20);
            intArray.add(5);
            intArray.add(5);
            intArray.add(7);
            intArray.add(5);


            Arrays.copyOfRange(intArray,3,7);
        }}

