package Lesson3;

import java.util.Scanner;

public class BeginnerTask3 {

    public static void main(String[] args) {

        System.out.println("3. Create a method (program) which returns True if the given non-negative number is a multiple of\n" +
                "3 or a multiple of 5");


        Scanner NumberScanner = new Scanner(System.in);

        System.out.println("\n Enter your number here and push Enter ");
        int number = NumberScanner.nextInt();

        if((number % 3) == 0) {
            System.out.println("True  " + number + " is a multiple of 3");
        }
        else if ((number % 5) ==0) {
            System.out.println("True  " + number + " is a multiple of 5");
        }
        else
            System.out.println("True  " + number + " is not multiple of 3 or 5");

        NumberScanner.close();
    }
}


