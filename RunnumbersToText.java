package org.java2.maciej.swiderski.zadanie009ogolne.zadanie1;

import java.util.Scanner;

public class RunnumbersToText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number you want to convert to text:");
        int number = scanner.nextInt();

        NumbersToText numbersToText= new NumbersToText();
        String converted = numbersToText.convertNumbers(number);

        System.out.println(converted);

    }
}
