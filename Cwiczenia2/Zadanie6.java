public class Zadanie6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
        System.out.println("------");
        for(int m=1; m<=n; m++){
            System.out.println(" " + "*".repeat(m) + " ");
        }
    }
}