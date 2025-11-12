public class BinearySeach3 {
    public static void main(String[] args) {
        int[] number = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 6, 6 };
        int l = 0;
        int h = number.length - 1;
        int index = -1;
        int target = 3;
        if (l <= h) {
            int mid = (l + h) / 2;
            if (number[index] < target) {
                l = mid + 1;
            } else if (number[index] > target) {
                h = mid - 1;
            } else {
                index = mid;
                l = mid + 1;
            }
        }
        System.out.println("found at index" + index);
    }
}
