package org.java2.maciej.swiderski.zadania014rekurencja.zadanie2;

import java.util.Scanner;

public class RunSumOf {

    public static void main(String[] args) {

        SumOf sumOf = new SumOf();
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number you wanto to calculate the sum of sequence for");
        int number = scanner.nextInt();

        long start = System.currentTimeMillis();
        int result = sumOf.calculateSumRecursion(number);
        long end = System.currentTimeMillis();
        System.out.println(result + "\t" + (end - start));

        long start1 = System.currentTimeMillis();
        int result1 = sumOf.calculateSum(number);
        long end1 = System.currentTimeMillis();
        System.out.println(result1 + "\t" + (end1 - start1));

        if ((end - start) < (end1 - start1)) {
            System.out.println("Recursion speeds up a compilation");
        } else if ((end - start) == (end1 - start1)) {
            System.out.println("Both techniques take the same time");
        } else {
            System.out.println("Recursion slowns down a compilation process");
        }
    }
}
