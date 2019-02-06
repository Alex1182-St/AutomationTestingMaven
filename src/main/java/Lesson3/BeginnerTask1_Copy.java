package Lesson3;

import java.util.ArrayList;

public class BeginnerTask1_Copy {

    public static void main(String[] args) {

        System.out.println("Given an array of integer numbers.\n" +
                "Create a method (program) which returns a new one where each element is multiplied by 3");

        ArrayList<Integer> ArrayWithInts = new ArrayList<Integer>();
        ArrayList<Integer> ArrayMultipled = new ArrayList<Integer>();

        ArrayWithInts.add(1);
        ArrayWithInts.add(5);
        ArrayWithInts.add(100);
        ArrayWithInts.add(0);


        //You can also loop through an ArrayList with the for-each loop:
        for (int i = 0; i < ArrayWithInts.size(); i++) {
            System.out.println(ArrayWithInts.get(i));
        }

        //Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
        for (int i : ArrayWithInts) {
            System.out.println(i);
        }


        // умножаю на 3

        for (int i = 0; i < ArrayWithInts.size(); i++) {

            ArrayMultipled[i] = ArrayWithInts[i*3];


        }
    }}