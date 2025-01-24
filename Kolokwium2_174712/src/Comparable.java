import java.util.Arrays;

public interface Comparable {
    public <T> void sortDescending();
}

abstract class Sorting implements Comparable {
    public static <T> void sortDescending(T[] a) {
        Comparable[] aux = new Comparable[a.length];
        Arrays.sort(a);
        Arrays.sort(aux);
    }
}
