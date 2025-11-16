public class BinearySearch4 {
    public static void main(String[] args) {
        int[] number = { 1, 3, 6, 7, 8, 4, 5, 2 };
        PeakValuefind(number);
    }

    static int PeakValuefind(int[] number) {
        int l = 1;
        int h = number.length - 2;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (number[mid] > number[mid - 1] && number[mid] > number[mid + 1])
                return mid;
            else if (number[mid] > number[mid - 1] && number[mid] < number[mid + 1])
                l = mid + 1;
            else
                h = mid - 1;
        }
        return 0;

    }
}
