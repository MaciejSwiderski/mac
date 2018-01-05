package org.java2.maciej.swiderski.zadanie009ogolne.zadanie5;
// Bardzo dobrze. Każda metoda przygotowana osobno przyjmująca argumenty i zwracająca wynik.
public class Calculator {

    public int addition(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {

        int sub = a - b;
        return sub;
    }

    public int multiplication(int a, int b) {

        int multi = a * b;
        return multi;
    }

    public int division(int a, int b) {

        int div = a / b;
        return div;
    }

    public int exponentiation(int a, int b) {

        int toThePowerOf = 1;
        while (b > 0) {
            toThePowerOf *= a;
            b--;
        }
        return toThePowerOf;
    }
}
