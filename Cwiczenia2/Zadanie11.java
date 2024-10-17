public class Zadanie11 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ciąg Fibonacciego do n=" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
