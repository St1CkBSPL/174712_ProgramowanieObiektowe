import java.util.*;
import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);
        List<Integer> result = merge(tab1, tab2);
        System.out.println(result);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> wynik = new ArrayList<>();
        int size1 = tab1.size();
        int size2 = tab2.size();
        int maxSize = Math.max(size1, size2);
        for(int i = 0; i<maxSize; i++){
            if(i<size1){
                wynik.add(tab1.get(i));
            }
            if(i<size2){
                wynik.add(tab2.get(i));
            }
        }
        return wynik;
    }

    }
