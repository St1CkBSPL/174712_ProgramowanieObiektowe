import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int number = 202;
        int S = 19;
        int x = 10;
        int y = 5;
        int k = 2;
        int n = 3;
        int z = 2;
        int m = 3;
        int j = 5;
        int[] tab = new int[j+1];
        tab[0] = 1;
        tab[1] = 6;
        tab[2] = 4;
        tab[3] = 2;
        tab[4] = 9;
        System.out.println(czyPalindrom(number));
        System.out.println(najblizszySasiad(S));
        System.out.println(pierwiastek(S,n,k));
        System.out.println(podciag(tab));
        System.out.println(podciag2(tab));
        System.out.println(palindromliczbowy(m,number));
        //System.out.println(dokladnosc(x,y,k));
        }


    public static int najblizszySasiad(int S){
        int sqrt = (int) Math.sqrt(S);
        return sqrt;
    }
    public static float pierwiastek(int S, int n, long k){
        double result = Math.pow(S,(1.0/n));
        System.out.println(Math.round(result));
        return (float) result;
    }


    public static boolean czyPalindrom(int number){
        int reverse = 0;
        int liczba = number;
        boolean palindrome = false;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(liczba == reverse){
            palindrome = true;
        }
        else{
            return palindrome;
        }
        return palindrome;
    }
    public static int palindromliczbowy(int m, int number) {
        int min = (int) Math.pow(10, m - 1);
        int max = (int) Math.pow(10, m) - 1;
        int reverse = 0;
        int wynik = 1;
        int liczba = number;
        for (int i = min; i <= max; i++) {
            for (int j = min; i <= max; j++) {
                if (i * j == number) {
                    wynik = i * j;
                }
                else{
                    return 0;
                }
            }
        }
        return wynik;
    }

    public static int podciag(int[] tab){
        int count = 0;
        int dlugosc = tab.length;
        for(int i = 0; i < dlugosc-1; i++){
            if(tab[i] > tab[i+1]){
                count++;
            }
        }
        return count;
    }
    public static int podciag2(int[] tab){
        int count = 1;
        int r = 2;
        int dlugosc = tab.length;
        for(int i = 0; i < dlugosc-1; i++){
            if(tab[i] > tab[i+1] && tab[i] - tab[i+1] == r){
                count++;
            }
        }
        return count;
    }
}