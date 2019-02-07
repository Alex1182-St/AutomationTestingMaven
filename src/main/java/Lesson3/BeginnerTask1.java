package Lesson3;

/*
1. Given an array of integer numbers. Create a method (program) which returns a new one where
each element is multiplied by 3
 */

public class BeginnerTask1 {



    public static void main(String[] args) {

        System.out.println("1. Given an array of integer numbers.\n" +
                "Create a method (program) which returns a new one where each element is multiplied by 3");


        int[] Array = {1, 25, 100, 400,0};

        int[] ResultMult = new int[5];

        for(int i=0 ; i<Array.length ; i++) {
            ResultMult[i] = Array[i]*3;
        }
        for (int i = 0; i < ResultMult.length; i++) {
            System.out.println(ResultMult[i]);
        }

    }}

        /* Таким образом не работает -
            for (int i : Array) {
                ResultMult[i] = Array[i]*3;}
            for (int i : ResultMult) {
                System.out.println(ResultMult[i]);}
         */
