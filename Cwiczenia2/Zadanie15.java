public class Zadanie15 {
    public static void main(String[] args) {
            int number = 7337, reverse = 0;
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println("Numer odwrocony " + reverse);
            int liczba = 7337;
                if(liczba - reverse == 0) System.out.println("jest palindromem");
                else{
                System.out.println("nie jest palindromem");
                }
            }
        }
