package org.java2.maciej.swiderski.zadania011algorytmy.zadanie1;

import java.util.Scanner;

public class RunSquareEquation {

    public static void main(String[] args) {

        SquareEquation squareEquation = new SquareEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide first parameter to calculate the root of square equation: a");
        double a=scanner.nextDouble();
        System.out.println("provide second parameter to calculate the root of square equation: b");
        double b=scanner.nextDouble();
        System.out.println("provide third parameter to calculate the root of square equation: c");
        double c=scanner.nextDouble();
        squareEquation.rootOfTheSquareEquation(a,b,c);
    }
}
