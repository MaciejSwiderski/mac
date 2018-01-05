package org.java2.maciej.swiderski.zadanie009ogolne.zadanie5;

import org.apache.log4j.*;

import java.util.Scanner;
// Bardzo dobrze. Lepiej zmieniać ustawienia w pliku konfiguracyjnym niż kodzie źródłowym
public class RunCalculator {
    public static void main(String[] args) {

        Layout myLayout = new PatternLayout("[%p] %c ( %m ) Log date: %d %n");
        Appender app1 = new ConsoleAppender(myLayout);

        // The below commented code writes the log straight to the txt file but it seems to be overwriting the console output at the same time
        // I've read that in order to have both file and console log created I need to change Log4j Xml Configuration
        //but not 100% sure how to do it?


        /*Appender app1 = null;

        try {
            app1 = new FileAppender(myLayout,"C:\\Users\\Maciej\\Desktop\\LogTracking.txt");
        } catch(IOException ex) {

        }*/
        BasicConfigurator.configure(app1);
        Logger logger = Logger.getLogger("mathematical operation's result:");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do a mathematical operation");
        String math = scanner.nextLine();
        try {
            if (math.matches("\\d+\\+\\d+")) {
                String[] sumOf = math.split("\\+");
                int a = Integer.parseInt(sumOf[0]);
                int b = Integer.parseInt(sumOf[1]);
                int result = calculator.addition(a, b);
                logger.info(a + "+" + b + "=" + result);
            } else if ((math.matches("\\d+\\-\\d+"))) {
                String[] deductOf = math.split("\\-");
                int c = Integer.parseInt(deductOf[0]);
                int d = Integer.parseInt(deductOf[1]);
                int result1 = calculator.subtraction(c, d);
                logger.info(c + "-" + d + "=" + result1);
            } else if ((math.matches("\\d+\\*\\d+"))) {
                String[] multi = math.split("\\*");
                int e = Integer.parseInt(multi[0]);
                int f = Integer.parseInt(multi[1]);
                int result2 = calculator.multiplication(e, f);
                logger.info(e + "*" + f + "=" + result2);
            } else if ((math.matches("\\d+\\/\\d+"))) {
                String[] divide = math.split("\\/");
                int g = Integer.parseInt(divide[0]);
                int h = Integer.parseInt(divide[1]);
                int result3 = calculator.division(g, h);
                logger.info(g + "/" + h + "=" + result3);
            } else if ((math.matches("\\d+\\^\\d+"))) {
                String[] power = math.split("\\^");
                int i = Integer.parseInt(power[0]);
                int j = Integer.parseInt(power[1]);
                int result4 = calculator.exponentiation(i, j);
                logger.info(i + "^" + j + "=" + result4);
            } else {
                logger.info("Operation forbidden ");
            }
        } catch (ArithmeticException e) {
            logger.info("Do not divide by zero");
        }
    }
}
