package varietyOf;

public class BinarySearch {

    public int doBinarySearch(int[] tableToSearch, int left, int right, int x) {

        while (right >= 1) {

            int mid = left + (right - left) / 2;
            if (tableToSearch[mid] == x) {
                return mid;
            }
            if (tableToSearch[mid] > x) {
                return doBinarySearch(tableToSearch, left, mid - 1, x);
            } else {
                return doBinarySearch(tableToSearch, mid + 1, right, x);
            }
        }
        return -1;
    }
}



