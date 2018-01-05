package org.java2.maciej.swiderski.zadanie009ogolne.zadanie1;

public class NumbersToText {
    private static final String[] NUMBERS1 = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    private static final String[] NUMBERS10 = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] NUMBERS100 = {
            "",
            "hundred",
            "two hundred",
            "three hundred",
            "four hundred",
            "five hundred",
            "six hundred",
            "seven hundred",
            "eight hundred",
            "nine hundred",
    };

    public String convertNumbers(int number) {

        String result = "";

        if (number % 10 == 0) {
            if (number < 100) {
                result = NUMBERS10[number / 10];
            } else {
                result = NUMBERS100[number / 100] + NUMBERS10[(number % 100) / 10];
            }
        } else if (number < 10) {
            result = NUMBERS1[number];
        } else if (number < 20) {
            result = NUMBERS1[number - 1];
        } else if ((number > 20) && (number < 100)) {
            result = NUMBERS10[number / 10] + NUMBERS1[number % 10];
        } else if ((number > 100) && (number < 1000)) {
            result = NUMBERS100[number / 100] + convertNumbers(number % 100);
        }
        return result;
    }
}
