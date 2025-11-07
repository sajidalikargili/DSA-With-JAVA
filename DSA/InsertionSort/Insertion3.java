package DSA.InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion3 {
    public static void main(String[] args) {
        int[] number = { 1, 4, 45, 6, 10, 8 };
        int target = 16;
        if (twoSume(number, target)) {
            System.out.println("Pair Found");

        } else {
            System.out.println("Pair not Found");
        }

    }

    static Boolean twoSume(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("paire " + arr[i] + " " + arr[j]);
                return true;
            } else if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            }
        }
        return false;
    }
}
