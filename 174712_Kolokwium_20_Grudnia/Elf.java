public class Elf {
    private String imie;
    private Integer wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko){
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String przedstawSie(){
        return "Cześć, nazywam się " + this.imie + ", mam " + this.wiek + ", a moje stanowisko pracy to " + this.stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.imie = imie;
        }
    }

    public int getWiek(){
        return wiek;
    }
    public void setWiek(Integer wiek){
        if(wiek == null || wiek < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }else{
            this.wiek = wiek;
        }
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Elf that = (Elf) o;
        return imie.equals(that.imie) && wiek.equals(that.wiek) && stanowisko.equals(that.stanowisko);
    }
    @Override
    public int hashCode(){
        return imie.hashCode() + wiek.hashCode() + stanowisko.hashCode();
    }
    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko=" + stanowisko +
                '}';
    }
}


