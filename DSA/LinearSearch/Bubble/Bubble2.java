package DSA.Linear.Bubble;

public class Bubble2 {
    public static void main(String[] args) {
        // this is reverse the cod of decending
        // 7 6 5 4 2 1 -2
        int[] number = { -2, 4, 5, 6, 2, 1, 7 };
        int swaps = 0;
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] < number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0)
                break;

        }
        System.out.println("sourted Array:");
        for (int n : number) {
            System.out.print(n + " ");
        }

    }

}
