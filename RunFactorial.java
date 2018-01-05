package org.java2.maciej.swiderski.zadania014rekurencja.zadanie3;

import java.util.Scanner;

public class RunFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number you want to calculate a factorial for");
        int number = scanner.nextInt();

        Factorial factorial = new Factorial();
        long start = System.currentTimeMillis();
        int result = factorial.calculateFactorial(number);
        long end = System.currentTimeMillis();
        System.out.println(result);

        long start1 = System.currentTimeMillis();
        int result1 = factorial.calculateFactorialNormalWay(number);
        long end1 = System.currentTimeMillis();
        System.out.println(result1);
        long timer = (end - start);
        long timer1 = (end1 - start1);

        if (timer > timer1) {
            System.out.println("Calculation factorial useing recursion takes longer");
        } else if (timer==timer1){
            System.out.println("Both methods last the same");
        }else{
            System.out.println("Non recursion calculation takes longer to compile");
        }
    }
}
