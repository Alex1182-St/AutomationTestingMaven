package Lesson3;

public class BeginnerTask9 {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public BeginnerTask9(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        System.out.println("9. Create method which takes two integers (a and b), performs their division (a/b) and outputs\n" +
                "accurate result of division (this means the result should have a decimal part, if any)");

        BeginnerTask9 Task2 = new BeginnerTask9(0, 0);// щоб не вносити значення по умовчанню, то потрібно конструктор зробити пустим та прибрати this в ньому
        Task2.setA(3);
        Task2.setB(7);
        int Task2A=Task2.getA();
        int Task2B=Task2.getB();

        Division CalcResult = new Division();

        System.out.println("\nDivision result is " + CalcResult.divisionMethod(Task2A,Task2B));
    }}

class Division {

    public double divisionMethod(int a, int b) {

        double c;
        c = a /(double) b;
        return c;
    }}