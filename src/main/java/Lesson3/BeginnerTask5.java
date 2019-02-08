package Lesson3;

import java.util.HashMap;
import java.util.Scanner;

public class BeginnerTask5 {

        public static void main(String[] args) {

            System.out.println("5. There are several marks in the school: from 1 to 5 (the highest). Create a method (program)\n" +
                    "which takes a mark and return your result (for ex. \"Excellent\", \"Good\", \"Failed\" etc.). Please do\n" +
                    "not use if...else condition");

            HashMap<Integer,String> SchoolMarks = new HashMap<Integer, String>();
            SchoolMarks.put(1,"Very Bad");
            SchoolMarks.put(2,"Bad");
            SchoolMarks.put(3,"Failed");
            SchoolMarks.put(4,"Good");
            SchoolMarks.put(5,"Excellent");

            Scanner NumberScanner = new Scanner(System.in);

            System.out.println("Enter your number here and push Enter ");
            int number = NumberScanner.nextInt();

            System.out.println(SchoolMarks.get(number));

            NumberScanner.close();

        }}
