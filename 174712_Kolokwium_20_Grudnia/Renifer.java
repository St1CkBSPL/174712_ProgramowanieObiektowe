public class Renifer {
    private String imie;
    private Integer predkosc;

    public Renifer(String imie, int predkosc){
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public int nakarmRenifera(){
        return this.predkosc += 5;
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
    public int getPredkosc(){
        return predkosc;
    }
    public void setPredkosc(Integer predkosc){
        if(predkosc == null || predkosc < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }else{
            this.predkosc = predkosc;
        }
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Renifer that = (Renifer) o;
        return imie.equals(that.imie) && predkosc.equals(that.predkosc);
    }
    @Override
    public int hashCode(){
        return imie.hashCode() + predkosc.hashCode();
    }
    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }
}
