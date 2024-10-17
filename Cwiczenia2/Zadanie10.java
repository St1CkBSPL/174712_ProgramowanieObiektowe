public class Zadanie10 {
    public static long silnia(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            return fact *= i;
        }
        return fact;
    }
    public static long dwumianNewtona(int n, int k) {
        if (k < 0 || n < 0 || k > n) {
            return 0;
        } else {
            return silnia(n) / (silnia(k) * silnia(n - k));
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 9;
        System.out.println("Dwumian Newtona dla n = " + n + " i k = " + k + " wynosi: " + dwumianNewtona(n, k));
    }
}
