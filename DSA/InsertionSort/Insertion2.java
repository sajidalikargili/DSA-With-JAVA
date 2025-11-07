package DSA.InsertionSort;

public class Insertion2 {
    public static void main(String[] args) {
        int[] number = { 8, 4, 1, 9, -3, 6, 5 };
        int n = number.length - 1;
        for (int i = n; i >= 0; i--) {
            int max = number[i];
            int maxdx = i;
            for (int j = i; j >= 0; j--) {
                if (number[j] > max) {
                    max = number[j];
                    maxdx = j;
                }
            }
            int temp = number[i];
            number[i] = number[maxdx];
            number[maxdx] = temp;
        }
        for (int i : number) {
            System.out.print(i + " ");
        }
    }
}
// public class Insertion2 {
// public static void main(String[] args) {
// int[] number = { 8, 4, 1, 9, -3, 6, 5 };
// int n = number.length;
// for (int i = n - 1; i >= 0; i--) {
// int maxdx = i;
// for (int j = i - 1; j >= 0; j--) {
// if (number[j] > number[maxdx]) {
// maxdx = j;
// }
// }
// int temp = number[i];
// number[i] = number[maxdx];
// number[maxdx] = temp;

// }
// for (int i : number) {
// System.out.print(i + " ");
// }
// }
// }
// public class Insertion2 {
// public static void main(String[] args) {
// int[] number = {8, 4, 1, 9, -3, 6, 5};

// int n = number.length;
// for (int i = n - 1; i >= 0; i--) {
// int maxIndex = i;
// for (int j = i - 1; j >= 0; j--) {
// if (number[j] > number[maxIndex]) {
// maxIndex = j;
// }
// }
// // Correct swapping
// int temp = number[i];
// number[i] = number[maxIndex];
// number[maxIndex] = temp;
// }

// // Print sorted array
// for (int num : number) {
// System.out.print(num + " ");
// }
// }
// }
