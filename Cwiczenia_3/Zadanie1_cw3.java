import java.util.Random;
import java.util.*;

public class Zadanie1_cw3 {
    public static void main(String[] args) {
        int n = 10;
        int[] tablica = new int[n];
        int min = 1;
        int max = 10;
        generujTablice(tablica,n,min,max+1);
        int wynik_nieparzyste = nieparzyste(tablica);
        int wynik_parzyste = parzyste(tablica);
        int wynik_dodatnie = dodatnie(tablica);
        int wynik_ujemne = ujemne(tablica);
        int wynik_zerowe = zerowe(tablica);
        int wynik_maksymalne = maksymalne(tablica, 9);
        int wynik_minimalne = minimalne(tablica, 1);
        int wynik_unikalne = unikalne(tablica);
        int suma_dodatnie = suma_dodatnie(tablica);
        int suma_ujemne = suma_ujemne(tablica);
        float suma_odwrotne = suma_odwrotne(tablica);
        float srednia_arytmetyczna = srednia_arytmetyczna(tablica, n);
        double srednia_geometryczna = srednia_geometryczna(tablica);
        double srednia_harmoniczna = srednia_harmoniczna(tablica);
        int funkcja_liniowa = funkcja_liniowa(tablica);
        wypisz(tablica);
        System.out.println(" ");
        System.out.println("Ilość nieparzystych: " + wynik_nieparzyste);
        System.out.println("Ilość parzystych: " + wynik_parzyste);
        System.out.println("Ilość dodatnich: " + wynik_dodatnie);
        System.out.println("Ilość ujemnych: " + wynik_ujemne);
        System.out.println("Ilość zerowych: " + wynik_zerowe);
        System.out.println("Ilość maksymalnych: " + wynik_maksymalne);
        System.out.println("Ilość minimalnych: " + wynik_minimalne);
        System.out.println("Ilość unikalnych: " + wynik_unikalne);
        System.out.println("Suma dodatnich: " + suma_dodatnie);
        System.out.println("Suma ujemnych: " + suma_ujemne);
        System.out.println("Suma odwrotych: " + suma_odwrotne);
        System.out.println("Średnia arytmetyczna: " + srednia_arytmetyczna);
        System.out.println("Średnia geometryczna: " + srednia_geometryczna);
        System.out.println("Średnia harmoniczna: " + srednia_harmoniczna);
        System.out.println("Funkcja liniowa: " + funkcja_liniowa);
    }

    public static int[] generujTablice(int[] tablica, int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(max - min) + min;
        }
        return tablica;
    }

    public static void wypisz(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

    public static int nieparzyste(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
    public static int parzyste(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }
    public static int dodatnie(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > 0) {
                result += 1;
            }
        }
        return result;
    }
    public static int ujemne(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 0) {
                result += 1;
            }
        }
        return result;
    }
    public static int zerowe(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 0) {
                result += 1;
            }
        }
        return result;
    }
    public static int maksymalne(int[] tablica, int max) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == max) {
                result += 1;
            }
        }
        return result;
    }
    public static int minimalne(int[] tablica, int min) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == min) {
                result += 1;
            }
        }
        return result;
    }
    public static int unikalne(int[] tablica) {
        long unique = Arrays.stream(tablica).distinct().count();
        return (int) unique;
    }
    public static int suma_dodatnie(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > 0) {
                result += tablica[i];
            }
        }
        return result;
    }
    public static int suma_ujemne(int[] tablica) {
        int result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < 0) {
                result += tablica[i];
            }
        }
        return result;
    }
    public static float suma_odwrotne(int[] tablica) {
        float result = 0;
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] != 0){
                result += 1.0 / tablica[i];
            }
            }
        return result;
    }
    public static float srednia_arytmetyczna(int[] tablica, int n) {
        float result = 0;
        for (int i = 0; i < tablica.length; i++) {
            result += tablica[i];
            }
        return result / n;
    }
    public static double srednia_geometryczna(int[] tablica) {
        double result = 0;
        double n = 10;
        for (int i = 0; i < tablica.length; i++) {
            result += tablica[i];
        }
        return Math.pow(result, 1/n);
    }
    public static double srednia_harmoniczna(int[] tablica) {
        double result = 0;
        double n = 10;
        double jedynka = 1;
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] != 0){
                result += n / (jedynka/tablica[i]);
            }
        }
        return result;
    }
    public static int funkcja_liniowa(int[] tablica) {
        int a = 1;
        int b = 2;
        int wynik = 0;
        for (int i = 0; i < tablica.length; i++) {
            wynik = a*tablica[i]+b;
        }
        return wynik;
    }
}