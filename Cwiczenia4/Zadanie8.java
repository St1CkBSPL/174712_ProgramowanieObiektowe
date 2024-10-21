import java.util.*;

public class Zadanie8 {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>(Arrays.asList(1,4,5,5,6,7));
        Collections.sort(tab);
        ArrayList<ArrayList<Integer>> wynik = countArrayList(tab);
        for(ArrayList<Integer> element : wynik){
            System.out.println(element);
        }


    }
    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab){
        int count = 1;
        ArrayList<Integer> wynik = new ArrayList<>();
        for (int i = 1;i<tab.size();i++){
            if(tab.get(i).equals(tab.get(i-1))){
                count++;
            } else{
                ArrayList<Integer> element = new ArrayList<>();
                element.add(tab.get(i-1));
                element.add(count);
                wynik.add(element);
                count = 1;
            }
        }
        ArrayList<Integer> element = new ArrayList<>();
        element.add(tab.get(tab.size() - 1));
        element.add(count);
        wynik.add(element);
        return wynik;
    }
}
