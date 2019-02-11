package Lesson3;

import java.util.Scanner;

public class BeginnerTask8 {

    public static void main(String[] args) {

        System.out.println("8. Given a string and an int n. Return a string made of the first n characters of the string, followed\n" +
                "by the first n-1 characters of the string, and so on. Example:\n" +
                "yourMethod(\"Testing\", 4) → \"TestTesTeT\"\n" +
                "yourMethod(\"Testing\", 3) → \"TesTeT\"\n" +
                "yourMethod(\"Testing\", 2) → \"TeT“");

        String strng = "Testing";

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number \"n\" as start of string and push Enter");
        int n = scan1.nextInt();

        System.out.println("Enter number \"d\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
        int d = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter number \"a\" as start of string and push Enter");
        int a = scan2.nextInt();
        System.out.println("Enter number \"b\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
        int b = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter number \"a\" as start of string and push Enter");
        int c = scan3.nextInt();
        System.out.println("Enter number \"b\" as end of string and push Enter. \"d\" cannot be lesser \"n\"");
        int e = scan3.nextInt();



        System.out.println(strng.substring(n,d) + strng.substring(a,b) + strng.substring(c,e));

        scan1.close();
        scan2.close();
        scan3.close();

    }}