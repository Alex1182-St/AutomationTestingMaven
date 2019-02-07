package Lesson3;

/*
2. Given two integers, x and y. Create a method (program) which returns True if one if them is 10
or if their sum is 10
 */

public class BeginnerTask2 {

    private int x;
    private int y;

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
    public BeginnerTask2( ) {

    }

    public static void main(String[] args)
    {
        System.out.println("2. Given two integers, x and y.\n" +
                "Create a method (program) which returns True if one if them is 10 or if their sum is 10");


        BeginnerTask2 Task2 = new BeginnerTask2();

        Task2.setX(3);
        Task2.setY(7);

        int Task2X = Task2.getX();
        int Task2Y = Task2.getY();
        int ComparedValue = 10;

        if (Task2X == ComparedValue) {
            System.out.println("True  " + "X is 10");
        }
        else if (Task2Y == ComparedValue) {
            System.out.println("True  " + "Y is 10");
        }
        else if (Task2X + Task2Y == 10) {
            System.out.println("True  " + "Their sum is 10");
        }
        else {
            System.out.println("False");
        }
    }
}


