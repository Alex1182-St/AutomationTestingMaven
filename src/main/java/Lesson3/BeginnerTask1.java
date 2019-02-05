package Lesson3;

/*
Given an array of integer numbers. Create a method (program) which returns a new one where
each element is multiplied by 3
 */

public class BeginnerTask1 {

    int[] IntegerNumbers;

    public int[] getIntegerNumbers() {
        return IntegerNumbers;
    }

    public void setIntegerNumbers(int[] integerNumbers) {
        IntegerNumbers = integerNumbers;
    }

    public BeginnerTask1(int[] integerNumbers) {
        IntegerNumbers = integerNumbers;
    }


    public static void main(String[] args) {

        /*
                BeginnerTask1 Task1 = new BeginnerTask1(int[] IntegerNumbers = {1, 5, 10, 50, 100, 0});
                for (int i = 0; i < Task1.IntegerNumbers.length; i++) {
                System.out.println(Task1.IntegerNumbers[i*3]);

                Можно ли так ??????

                Я создаю новый обьект Task1, у которого переменная масив и во время создания указываю какие интовые значения в масиве??????
         */


        int[] IntegerNumbers = {1,5,10,50,100,0};
        for (int i = 0; i < IntegerNumbers.length; i++) {
            System.out.println(IntegerNumbers[i*3]);
        }
    }
}


