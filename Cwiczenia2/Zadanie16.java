public class Zadanie16 {
        public static boolean czyDoskonala(int n) {
            if (n < 1) {
                return false;
            }
            int sumaDzielnikow = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sumaDzielnikow += i;
                }
            }
            return sumaDzielnikow == n;
        }

        public static void main(String[] args) {
            int n = 2;
            if (czyDoskonala(n)) {
                System.out.println(n + " jest liczbą doskonałą.");
            } else {
                System.out.println(n + " nie jest liczbą doskonałą.");
            }
        }
    }
