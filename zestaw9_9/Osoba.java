public class Osoba extends Klient{
    public String imie;
    public String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getimie(){
        return imie;
    }

    public String getnazwisko(){
        return nazwisko;
    }
}
