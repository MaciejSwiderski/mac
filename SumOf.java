package org.java2.maciej.swiderski.zadania014rekurencja.zadanie2;

public class SumOf {

    public int calculateSumRecursion(int number) {

        if (number == 1)
            number = 1;
        else
            number = number + calculateSumRecursion(number - 1);
        return number;
    }

    public int calculateSum(int number) {

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        return result;
    }
}
