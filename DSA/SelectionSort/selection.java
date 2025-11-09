public class selection {
    public static void main(String[] args) {
        int[] number = { 4, 1, 7, 3, 9, 2, 0, 8, 6 };
        for (int i = 1; i < number.length; i++) {
            int j = i;
            while (j > 0 && number[j] < number[j - 1]) {
                int temp = number[j];
                number[j] = number[j - 1];
                number[j - 1] = temp;
                j--;
            }
        }
        for (int n : number) {
            System.out.print(n + " ");
        }
    }
}
