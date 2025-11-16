public class BinarySearch6 {
    public static void main(String[] args) {
        var result = floorSquart(15);
        System.out.println(result);
    }

    static int floorSquart(int n) {
        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i > n)
                break;
            root = i;

        }
        return root;
    }
}
