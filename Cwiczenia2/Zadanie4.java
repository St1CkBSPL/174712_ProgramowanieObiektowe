public class Zadanie4 {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num) {
        if(num <2){
            return false;
        }
        for(int i=2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
