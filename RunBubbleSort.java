package varietyOf;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RunBubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number of items you want to sort");

        int numberOfItems = scanner.nextInt();

        Random random = new Random();

        int[] myTable = new int[numberOfItems];
        for (int i = 0; i < myTable.length; i++) {
            myTable[i] = random.nextInt(150);
        }
        System.out.println("Unsorted table: " + (Arrays.toString(myTable)));
        BubbleSort bubbleSort = new BubbleSort();
        int[] newMyTable = bubbleSort.sortTable(myTable);
        System.out.println("Bubble sort result: " + (Arrays.toString(newMyTable)));

        System.out.println("provide a number you want to find an index of:");
        int x = scanner.nextInt();

        int left = 0;
        int right = myTable.length;

        BinarySearch binarySearch = new BinarySearch();
        int result1 = binarySearch.doBinarySearch(myTable, 0, right - 1, x);

        if (result1 == -1) {
            System.out.println("no such element found");
        } else {
            System.out.println("element found at: " + result1);
        }
    }
}
