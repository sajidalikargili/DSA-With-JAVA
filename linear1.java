public class linear1 {
    // find the value of target element in array
    public static void main(String[] args) {
        int[] numbers = { 4, 5, 6, 7, 8, 910 };
        int targetValue = 7;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == targetValue) {
                System.out.println("Value found at index  " + i + " is " + numbers[i]);
            }
        }
    }
    // Output: Value found at index 3 is 7
}
