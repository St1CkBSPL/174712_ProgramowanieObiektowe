public class Zadanie5 {
    public static void main(String[] args) {
        int m = 2;
        int n = 7;
        int min = (int) Math.pow(10,m-1);
        int max = (int) Math.pow(10,m) - 1;
        for(int i = min; i<= max; i++){
            if(i%n == 0){
                System.out.println(i);
            }
        }
    }
}
