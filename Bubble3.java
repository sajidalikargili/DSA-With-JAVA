public class Bubble3 {
    public static void main(String[] args) {

        int[] number = { 1, 2, 0, 3, 4, 0, 5, 0 };
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] == 0) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorrt the Array");
        for (int n : number) {
            System.out.print(n + " ");
        }

    }

}
