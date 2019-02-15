package Lesson3;

public class PreIntermediateTask5 {

    public static void main(String[] args) {

        System.out.println("5. You don't like number 7 and number 9. Write a method which checks input array and returns\n" +
                "True if the array doesn't contain your unloved numbers");

        int [] numbers ={-1,0,5,7,8,10,25,22,7,0};
        int numberToFind1 = 700;
        int numberToFind2 = 900;

        Numbers2 newNumbers = new Numbers2();

        if (newNumbers.unlovedNumbersPresence() == true){
         System.out.println("\n" + newNumbers.unlovedNumbersPresence() + "\nThere are unloved numbers");
        }
        else {
            System.out.println("\n" + newNumbers.unlovedNumbersPresence() + "\nThere are not unloved numbers");
    }
    }}

class Numbers {
    /*
    Error:(19, 8) java: class Numbers2 is public, should be declared in a file named Numbers2.java
    Выдает такую ошибку если "public class Numbers2" находится/написан в одном файле с PreIntermediateTask5_2
    Почему в BeginnerTask4 нет такой ошибки????

    Убрал public стало нормально. Другой способ исправления - отдельный файл для Numbers2.

    Почему нельзя через public???

     */

    public boolean unlovedNumbersPresence(int[]numbers, int numberToFind1, int numberToFind2) {

        int i;
        boolean presence=false;

        for (i=0; i < numbers.length; i++ ){
            /*
            без "int i" выдает ошибку "Cannot resolve symbol i",
            а в BeginnerTask4 я "int i" не декларировал. Почему??????
             */
            if(numbers[i]==numberToFind1){
                return presence;
            }
            else if (numbers[i]==numberToFind2){
                return presence;
            }
            else {presence=true;}
        }
        return presence;
    }}


