package Lesson3;

public class PreIntermediateTask1 {

    public static void main(String[] args) {
        System.out.println("1. A couple is going to go to the cinema. That's makes sense, if both of them have the same mood.\n" +
                "There are two boolean parameters heSmile and sheSmile which indicate if each is smiling or\n" +
                "not. Write a method which returns True if they're eventually going to go to the cinema, of False\n" +
                "otherwise:\n" +
                "\n" +
                "visitCinema(true, true) → true\n" +
                "visitCinema(false, false) → true\n" +
                "visitCinema(true, false) → false\n");

        Smile theirSmile = new Smile();
        /*
        Возникает ошибка в new Smile() "...cannot be referenced from static content" если в public class Smile
        не добавить слово static. Хотя в BeginnerTask2 где таким же образом написан код (пустой конструктор) ошибки нет.?????????
         */

        theirSmile.setHeSmile(false);
        boolean theirSmileHeSmile = theirSmile.isHeSmile();
        theirSmile.setSheSmile(false);
        boolean theirSmileSheSmile = theirSmile.isHeSmile();

        theirSmile.visitCinema(theirSmileHeSmile,theirSmileSheSmile);
    }

    public static class Smile {
        private boolean heSmile;
        private boolean sheSmile;

        public boolean isHeSmile() {
            return heSmile; }

        public void setHeSmile(boolean heSmile) {
            this.heSmile = heSmile; }

        public boolean isSheSmile() {
            return sheSmile; }

        public void setSheSmile(boolean sheSmile) {
            this.sheSmile = sheSmile; }

        public Smile(){}


        public void  visitCinema (boolean heSmile, boolean sheSmile)
        {


            if ((heSmile == true) && (heSmile == sheSmile)) {

                System.out.println("They have the same mood (they smile) and want to go to the cinema");

            }
            else if ((heSmile == false) && (heSmile == sheSmile)) {

                System.out.println("They have the same mood (they do not smile) and do not want to go to the cinema");
            }
            else if ((heSmile == true) && (sheSmile == false)) {
                System.out.println("They have different mood (she does not smile) and do not go to the cinema");

            }
            else {
                System.out.println("They have different mood (he does not smile) and do not go to the cinema");

            }
        }
    }
}