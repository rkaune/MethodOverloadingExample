/*
 * Kaune October 4th, 2016
 */

package methodoverloadingexample;

/**
*
* @author rkaune
* Demonstrates method overloading.
*/
 public class MethodOverloadingExample {
    /**
    * Print a bar of asterisks across the screen.
    * pre: length > 0
    * post: Bar drawn of length characters, insertion
    * point moved to next line.
    */
    public static void drawBar(int length) {

            for (int i = 1; i <= length; i++) {
                    System.out.print("*");
            }
            System.out.println();
    }

    /**
    * Print a bar of a user selected mark across the screen.
    * pre: length > 0
    * post: Bar drawn of length characters, insertion
    * point moved to next line.
    */
    public static void drawBar(int length, String mark) {

            for (int i = 1; i <= length; i++) {
                    System.out.print(mark);
            }
            System.out.println();
    }


    public static void main(String[] args) {

            drawBar(10);
            drawBar(5, "@");
    }
}
