package DSA.InsertionSort;

public class Insertion1 {
    public static void main(String[] args) {
        int[] number = { 8, 4, 1, 9, -3, 6, 5 };
        for (int i = 0; i < number.length; i++) {
            int min = number[i];
            int mindx = i;
            for (int j = i; j < number.length; j++) {
                if (number[j] < min) {
                    min = number[j];
                    mindx = j;
                }
            }
            int temp = number[i];
            number[i] = number[mindx];
            number[mindx] = temp;

        }
        for (int n : number) {
            System.out.print(n + " ");
        }

    }

}
