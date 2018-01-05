package org.java2.maciej.swiderski.zadania014rekurencja.zadanie3;

public class Factorial {

    public int calculateFactorial(int number) {

        if (number == 0)

            number = 1;
        else
            number = number * calculateFactorial(number - 1);

        return number;
    }

    public int calculateFactorialNormalWay(int number) {

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
