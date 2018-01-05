package org.java2.maciej.swiderski.zadania014rekurencja.zadanie1;

import java.util.Scanner;

public class RunReversionNew {

    public static void main(String[] args) {

        ReversionNew reversionNew = new ReversionNew();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a text to reverse");
        String textToReverse = scanner.nextLine();

        long start = System.currentTimeMillis();
        reversionNew.reverseNormal(textToReverse);
        long end =System.currentTimeMillis();

        System.out.println(start+" "+end);

        long start1 = System.currentTimeMillis();
        String output =reversionNew.reverseRecursion(textToReverse);
        System.out.println("Recursion reverse reading "+output);
        long end1 = System.currentTimeMillis();

        long result = end-start;
        long result1 = end1-start1;

        System.out.println(start1+" "+end1);

        if(result<result1){
            System.out.println("Reverse reading useing recursion takes longer that normal way: "+result1);
        }else if(result==result1) {
            System.out.println("Both methods take the same time to compile");
        }else{
            System.out.println("Non - recursion reverse reading takes longer than recursion itself: "+result);
        }
    }
}
