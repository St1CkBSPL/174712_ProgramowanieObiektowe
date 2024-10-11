public class Zadanie2 {
    public static void main(String[] args) {
       int n = 2;
       for(int a = -n; a<=n; a++){
           for(int b = -n; b<=n; b++){
               for(int c = -n; c <=n; c++){
                   if(a != 0){
                       System.out.println("Wspolczynniki: a=" + a + "b=" + b + "c=" + c);
                   }
               }
           }
        }
    }
}
