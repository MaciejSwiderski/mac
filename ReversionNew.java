package org.java2.maciej.swiderski.zadania014rekurencja.zadanie1;

public class ReversionNew {

    public static String reverseRecursion(String text) {

        if (text.isEmpty())
            return text;

        return reverseRecursion(text.substring(1)) + text.charAt(0);
    }

    public void reverseNormal(String text) {

        String temp = "";
        for (int i = text.length() - 1; i >= 0; i--) {

            temp += text.charAt(i);
        }
        System.out.println("Non -recursion reverse reading: " + temp);
    }
}
