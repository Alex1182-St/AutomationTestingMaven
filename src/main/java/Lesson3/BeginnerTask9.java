package Lesson3;

public class BeginnerTask9 {
    int a;
    int b;

    public static void main(String[] args) {

        System.out.println("9. Create method which takes two integers (a and b), performs their division (a/b) and outputs\n" +
                "accurate result of division (this means the result should have a decimal part, if any)");
        int a=10;
        int b=257;

        division CalcResult = new division();

        System.out.println("Division result is " + CalcResult.divisionMethot(a,b));
    }
}

class division {

    public double divisionMethot(int a, int b) {
        float c;
        c = a /(float) b;
        return c;
    }
}
