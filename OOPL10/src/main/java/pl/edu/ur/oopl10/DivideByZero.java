/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class DivideByZero extends Exception {

    public DivideByZero() {
        System.out.println("Utowrzenie wyjatku dzielenia przez zero");
    }
}

class ExceptionSample {

    public void doSomething(int divisor) throws DivideByZero {
        System.out.println("Zgłoszenie wyjątku DivideByZero");
        if (divisor == 0) throw new DivideByZero();
    }
}
