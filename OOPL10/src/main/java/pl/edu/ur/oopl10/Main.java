package pl.edu.ur.oopl10;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("ZADANIE 1 \n");
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
    }

}
