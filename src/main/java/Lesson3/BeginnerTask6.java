package Lesson3;

public class BeginnerTask6 {

    public static void main(String[] args) {

        System.out.println("6. Print all even numbers from range (0..50). Try to solve this in more than one way");

        int [] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        for (int i : numbers) {
            if (i%2==0)   //Understanding The Modulus Operator % - https://stackoverflow.com/questions/17524673/understanding-the-modulus-operator
                System.out.println("Even " + i);
        }

        for (int i = 0; i <= 30; i = i + 2) { //второй способ решения
            System.out.println(i);
        }


}}
