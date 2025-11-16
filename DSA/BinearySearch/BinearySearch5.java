public class BinearySearch5 {
    public static void main(String[] args) {
        int[] number = { 1, 2, 8, 10, 10, 12, 19 };
        int target = 5;
        int result = floorValue(number, target);
        System.out.println(result);
    }

    static int floorValue(int[] number, int target) {
        int i = 0;
        int h = number.length - 1;
        int index = -1;
        while (i <= h) {
            int mid = (i + h) / 2;
            if (number[mid] > target) {
                h = mid - 1;
            } else {
                index = mid;
                i = mid + 1;
            }
        }
        return index;

    }
}
