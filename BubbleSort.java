package varietyOf;

public class BubbleSort {

    public int[] sortTable(int[] a) {

        int[] myTable = a;

        int temp = 0;
        for (int i = 0; i < myTable.length - 1; i++) {
            for (int j = 0; j < myTable.length - 1 - i; j++) {
                if (myTable[j] > myTable[j + 1]) {
                    temp = myTable[j];
                    myTable[j] = myTable[j + 1];
                    myTable[j + 1] = temp;
                }
            }
        }
        return myTable;
    }
}
