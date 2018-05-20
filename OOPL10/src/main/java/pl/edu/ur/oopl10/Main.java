package pl.edu.ur.oopl10;

import java.util.Random;
/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("ZADANIE 1 i 5 \n");
        WprowadzZKonsoli.wprowadzInt();
        WprowadzZKonsoli.wprowadzChar();
        WprowadzZKonsoli.wprowadzString();
        WprowadzZKonsoli.wprowadzFloat();
        WprowadzZKonsoli.wprowadzLong();
        WprowadzZKonsoli.wprowadzShort();
        WprowadzZKonsoli.wprowadzDouble();
        System.out.println("\n ZADANIE 2 \n");
        int[] myIntArray = new int[3];
        for (int i = 0; i < 5; i++) {
            try {
                myIntArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException w) {
                System.out.print("Wyjątek: ");
                System.out.println(w.getMessage());
            }
        }
        System.out.println("\n ZADANIE 3 \n");
        ExceptionSample sample = new ExceptionSample();
        try {
            int divisor = 0;
            sample.doSomething(divisor);
        } catch (DivideByZero e) {
            e.printStackTrace();
            System.out.println("Wyjątek został złapany");
        }
        System.out.println("\n ZADANIE 4 \n");
        Random rand = new Random();
        int counter  = 0;
        while(counter != 3) {
            int randomNum1 = -10 + rand.nextInt((10 - -10) + 1);
            int randomNum2 = -10 + rand.nextInt((10 - -10) + 1);
            if(randomNum2 == 0) {
                counter++;
                System.out.println("Dzielnie przez zero jest niemożliwe " + counter);
            } else {
              double divide = randomNum1/randomNum2; 
              System.out.println("Wynik dzielenia" + divide);
            }
        }
        if(counter == 3) {
            System.out.println("3 wystapienia");
            throw new ArithmeticException();
        }
    }

}
