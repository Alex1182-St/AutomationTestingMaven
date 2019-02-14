
package Lesson3;
public class PreIntermediateTask3 {

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

    public PreIntermediateTask3( ) {
    }

    public static void main(String[] args)
    {
        System.out.println("3. Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum\n" +
                "is 21.\n");

        PreIntermediateTask3 Task2 = new PreIntermediateTask3();

        Task2.setX(33);
        Task2.setY(7);

        int Task2X = Task2.getX();
        int Task2Y = Task2.getY();
        int ComparedValue = 21;

        if (Task2X == ComparedValue) {
            System.out.println("\n True  " + "X is 21");
        }
        else if (Task2Y == ComparedValue) {
            System.out.println("\n True  " + "Y is 21");
        }
        else if (Task2X + Task2Y == 22) {
            System.out.println("\n True  " + "Their sum is 21");
        }
        else {
            System.out.println("\n False");
        }
    }
}