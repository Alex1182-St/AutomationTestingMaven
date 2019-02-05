package Lesson3;

/*
Given two integers, x and y. Create a method (program) which returns True if one if them is 10
or if their sum is 10
 */

public class BeginnerTask2 {

    public int x;
    public int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public BeginnerTask2(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void main(String[] args)
            /*
            ругается, что getX и getY cannot be referenced from a static context
            может так писать - if (getX(Task2.x) = 10) ????????????
             */
    {
        BeginnerTask2 Task2 = new BeginnerTask2(100,0);

        if (getX() = 10) {
            System.out.println("True");
        }
        else if (getY() = 10 ) {
            System.out.println("True");
        }
        else if (getX() + getY() = 10) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}



