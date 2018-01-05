package org.java2.maciej.swiderski.zadania011algorytmy.zadanie1;

public class SquareEquation {

    public void rootOfTheSquareEquation(double a, double b, double c) {

        double delta = b * b - 4 * a * c;
        double root1;
        double root2;

        if (delta > 0) {

            root1 = ((-b - (Math.sqrt(delta))) / 2 * a);
            root2 = ((-b + (Math.sqrt(delta))) / 2 * a);

            System.out.printf("If delta = " + delta + " there are two roots of square equation exist:" +
                    " \n" + "root1 = %.2f\nroot2 = %.2f", root1, root2);
        } else if (delta == 0) {

            root1 = -b / 2 * a;

            System.out.printf("If delta = " + delta + " there is only one root of square equation :" +
                    " \n" + "root1 = %.2f", root1);
        } else {

            System.out.format("If delta = " + delta + " No root of square equation exists");
        }
    }
}
