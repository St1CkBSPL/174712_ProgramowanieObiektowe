public class Zadanie17 {
        public static boolean czyPierwsza(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int n = 9;
            if (czyPierwsza(n)) {
                System.out.println(n + " jest liczbą pierwszą.");
            } else {
                System.out.println(n + " nie jest liczbą pierwszą.");
            }
        }
    }
