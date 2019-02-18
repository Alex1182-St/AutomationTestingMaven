package Lesson3;

public class PreIntermediateTask5 {

    public static void main(String[] args) {

        System.out.println("5. You don't like number 7 and number 9. Write a method which checks input array and returns\n" +
                "True if the array doesn't contain your unloved numbers");
        int [] masiv = {-5,0,4,7,10,25,200,11,7};

        System.out.println("\nArray doesn't contain your unloved numbers - " + UnlovedNumbers.checkForUnloved(masiv,7,9));
        // почему не определяет 0, если он стоит вначале????
    }
}

class UnlovedNumbers {


    public static boolean checkForUnloved(int array[], int unloved1, int unloved2) {

        boolean presenceOfUnloved = true;

        for (int i=0; i<array.length; i ++)
        {
        if (array[i] == unloved1) {
            presenceOfUnloved = false;
        }
        else if (array[i] == unloved2) {
            presenceOfUnloved = false;
        }
        else {
            presenceOfUnloved = true;}
        }
        return presenceOfUnloved;
    }}




/*
    Пошук елемента в масиві ((-5) знаходить) -

  public static int checkForUnloved (int[] arrayOfInts, int intNumber)
    {
        int unloved = 0;
        for (int i = 0; i<arrayOfInts.length; i++){
          if (arrayOfInts[i]==intNumber){
              unloved = arrayOfInts[i];
          }
        }
        return unloved;
    }}

*/


