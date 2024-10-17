public class Zadanie18 {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int result = nwd(a, b);
        System.out.println(result);
    }

    public static int nwd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
