package Lesson3;

import java.util.ArrayList;

public class BeginnerTask1 {

    public static void main(String[] args) {

        System.out.println("1. Given an array of integer numbers.\n" +
                "Create a method (program) which returns a new one where each element is multiplied by 3\n");

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(-1);
        ints.add(5);
        ints.add(10);
        ints.add(7);

        Multiplication multik = new Multiplication();

        System.out.println(multik.arrayMult(ints,3));
    }}

class Multiplication {

    public  ArrayList<Integer> arrayMult (ArrayList<Integer> arr, int multInt)

    {
        for (int i = 0; i < arr.size(); i++){
            arr.set(i, arr.get(i)*multInt);
        }
        return arr;
    }
}