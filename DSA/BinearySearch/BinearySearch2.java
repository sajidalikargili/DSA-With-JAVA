public class BinearySearch2 {
    public static void main(String[] args) {
        // int[] number = { 1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11 };
        int[] number = { -1, 0, 1, 2, 5, 6, 8, 6, 3 };
        int l = 0;
        int h = number.length - 1;
        int index = -1;
        int target = 8;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (number[mid] > target) {
                h = mid - 1;
            } else if (number[mid] < target) {
                l = mid + 1;
            } else {
                index = mid;
                h = mid - 1;
            }
        }
        System.out.println("value found" + index);

    }
}
