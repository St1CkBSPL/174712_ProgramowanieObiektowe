public class Zadanie3 {
    public static void main(String[] args) {
        int n = 5;
        for(int a = -n; a<=n; a++){
            if(a==0) continue;
            for(int b = -n; b<=n; b++){
                for(int c = -n; c <=n; c++){
                   int delta = b * b - 4 * a * c;
                   if(delta >= 0){
                       int sqrtDelta = (int) Math.sqrt(delta);
                       if (sqrtDelta * sqrtDelta == delta){
                           System.out.println("Wspolczynniki: a=" + a + "b=" + b + "c=" + c);
                       }
                   }
                }
            }
        }
    }
}
