package Lesson3;

import java.util.Arrays;

public class BeginnerTask7 {


        public static void main(String[] args) {

            System.out.println("7. Given an array of integers. Find and print the max element in it");

            int [] numbers = {-10,-5,0,5,10,55,100,1000,33};

            Arrays.sort(numbers); //Сортировка

            int max = numbers[numbers.length-1];

            System.out.print("\nMax number is " + max + "\nArray numbers are" + "\n");


            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

        }}

