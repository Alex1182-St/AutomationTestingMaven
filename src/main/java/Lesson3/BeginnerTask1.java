package Lesson3;

public class BeginnerTask1 {

    public static void main(String[] args) {

        System.out.println("Given an array of integer numbers.\n" +
                "Create a method (program) which returns a new one where each element is multiplied by 3");

        int[] array1 = {1, 25, 100, 400,0};

        int[] ResultMult = new int[5];

        for(int i=0 ; i<array1.length ; i++) {
            ResultMult[i] = array1[i]*3;
        }
        for (int i = 0; i < ResultMult.length; i++) {
            System.out.println(ResultMult[i]);



        }}}
