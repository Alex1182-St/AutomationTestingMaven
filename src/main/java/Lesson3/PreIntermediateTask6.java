package Lesson3;

public class PreIntermediateTask6 {


    public static void main(String[] args) {

        System.out.println("6. Given an array of integers. Write a method which calculates sum of all elements and arithmetic\n" +
                "average of them");

        int[] myArray = {1,4,10,10,25,5,20};

        System.out.println("Sum of array elements is " + Calc.sumCalculation(myArray));
        System.out.println("Average of array elements is " + Calc.averageCalculation(myArray));

}}

class Calc {

    public static int sumCalculation (int[] array) {

        int sum = 0;

        for (int i=0; i <array.length; i++){
            sum = sum+array[i];
        }
        return sum;
    }

    public static double averageCalculation (int[] array) {

        double average = 0;
        int arrayLength;
        double sum = 0;

        for (int i=0; i <array.length; i++){
            sum = sum+array[i];
            arrayLength = array.length;
            average = sum/arrayLength;
        }
        return average;

    }

}