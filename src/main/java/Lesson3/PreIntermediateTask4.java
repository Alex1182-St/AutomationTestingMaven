
package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

            Object [] Array = intArray.toArray(); //ArrayList to Array(array of object type)

            System.out.println("\nArray length is " + Array.length);

            Scanner newScanner = new Scanner(System.in);
            System.out.println("Enter the start of diapason");
            int start = newScanner.nextInt();
            System.out.println("Enter the end of diapason");
            int end = newScanner.nextInt();

            Object [] diapasonArray = Arrays.copyOfRange(Array, start, end);

            System.out.println("\nYour diapason is ");

            for (int i = 0; i < diapasonArray.length; i++) {
                System.out.println(diapasonArray[i]);}

            newScanner.close();

        }}

