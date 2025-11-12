public class BinarySearch1 {
    public static void main(String[] args) {
        int[] number = { -1, 0, 3, 5, 9, 13 };
        int target = 9;

        int l = 0;
        int h = number.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (number[mid] == target) {
                System.out.println("Value found at index " + mid);
                return; // stop after finding it
            } else if (number[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        System.out.println("Value not found");
    }
}
