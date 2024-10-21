import java.util.*;
import java.util.ArrayList;

public class Zadanie1 {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);
        System.out.println(append(tab1,tab2));
    }
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        tab1.addAll(tab2);
        ArrayList<Integer> wynik = tab1;
        return wynik;
    }
}
