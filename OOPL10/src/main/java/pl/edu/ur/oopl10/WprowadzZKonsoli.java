/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    static public void wprowadzInt() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj int");
            int test = input.nextInt();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzChar() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj char");
           char test = input.next().charAt(0);
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzString() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj string");
           String test = input.nextLine();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzLong() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj long");
           long test = input.nextLong();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzShort() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj short");
           short test = input.nextShort();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzFloat() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj float");
          float test = input.nextFloat();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzDouble() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj double");
          double test = input.nextDouble();
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
}
