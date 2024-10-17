public class Zadanie13 {
     public static boolean czyPalindrom(String wyraz) {
            wyraz = wyraz.toLowerCase();
            int dlugosc = wyraz.length();
            for (int i = 0; i < dlugosc / 2; i++) {
                if (wyraz.charAt(i) != wyraz.charAt(dlugosc - i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String wyraz = "Kajak";

            if (czyPalindrom(wyraz)) {
                System.out.println("\"" + wyraz + "\" jest palindromem.");
            } else {
                System.out.println("\"" + wyraz + "\" nie jest palindromem.");
            }
        }
    }
