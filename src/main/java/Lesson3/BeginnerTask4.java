package Lesson3;

public class BeginnerTask4 {

        public static void main(String[] args) {

        int [] numbers = {0,5,7,3,5,70,25,100,100,7};
        int numberToFind =7;

        Calculation Calc = new Calculation();

        System.out.println("4. Given an array of integers. Create a method (program) which takes two arguments - this array\n" +
                "and number that you are looking for - and returns quantity of this number in the array");

        System.out.println("Number, that you are looking for is " + numberToFind);
        System.out.println("Numbers of looking for digits is " + Calc.MethodIntCalc(numbers, numberToFind));
    }
    }
    class Calculation{
        public int MethodIntCalc(int[] numbers, int numberToFind){
            int countOfNumberToFind = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==numberToFind){
                    countOfNumberToFind++;
                }
            }
            return countOfNumberToFind;
        }
    }