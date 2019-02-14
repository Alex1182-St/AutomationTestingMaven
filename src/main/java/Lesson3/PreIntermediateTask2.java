package Lesson3;

public class PreIntermediateTask2 {

    public static void main(String[] args) {

        System.out.println("2. Given a string. Write a method which swaps first and last characters and returns a new modified\n" +
                "string: swapChar(\"Cool text\") → \"tool texC“\n");

    String s = "Cool text";

    System.out.println("Old string is " + s);


    char[] arrayChar0 = s.toCharArray(); // строку в массив

    char[] arrayChar1 = s.toCharArray();

    char[] arrayChar2 = s.toCharArray();


    /* for (int i = 0; i < arrayChar0.length; i++)
         System.out.println("Array1 Character" + i + "-" + arrayChar0[i]);
    */

    arrayChar2[0]=arrayChar0[8];

    arrayChar2[8]=arrayChar1[0];

    System.out.println("\n");

       /* for (int i = 0; i < arrayChar2.length; i++)
            System.out.println("Array2 Character" + i + "-" + arrayChar2[i]);
    */

    String s2 = new String(arrayChar2); //массив в строку

    System.out.println("New string is " +s2);

}}


