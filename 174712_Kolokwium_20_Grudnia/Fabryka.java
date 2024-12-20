import java.util.ArrayList;

public class Fabryka{
    private ArrayList<Elf> listaElfow;
    private Integer dlGeo;
    private Integer szGeo;

    public Fabryka(Integer dlGeo, Integer szGeo){
        this.listaElfow = new ArrayList<>();
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf){
        listaElfow.add(elf);
    }
    public void usunPracownika(Elf elf){
        if(listaElfow != null) {
            listaElfow.remove(elf);
        }
    }
    public int getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(Integer dlGeo) {
        if(dlGeo == null || dlGeo < -180 || dlGeo > 180){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.dlGeo = dlGeo;
        }
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(Integer szGeo) {
        if(szGeo == null || szGeo < -90 || szGeo > 90){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.szGeo = szGeo;
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Fabryka that = (Fabryka) o;
        return dlGeo.equals(that.dlGeo) && szGeo.equals(that.szGeo) && listaElfow.equals(that.listaElfow);
    }
    @Override
    public int hashCode(){
        return dlGeo.hashCode() + szGeo.hashCode() + listaElfow.hashCode();
    }
    @Override
    public String toString() {
        return "Fabryka{" +
                "Długość geograficzna='" + dlGeo + '\'' +
                ", Szerokość geograficzna=" + szGeo +
                ", lista elfów=" + listaElfow +
                '}';
    }

}
