import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> listaReniferow;

    public Sanie(){
        this.listaReniferow = new ArrayList<>();
    }
    public void dodajRenifera(Renifer renifer){
        listaReniferow.add(renifer);
    }

    public int sumaPredkosci(Renifer renifer){
        int suma = 0;
        return suma += renifer.getPredkosc();
    }

    public ArrayList<Renifer> getListaReniferow() {
        return listaReniferow;
    }

    public void setListaReniferow(ArrayList<Renifer> listaReniferow) {
        if(listaReniferow == null || listaReniferow.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.listaReniferow = listaReniferow;
        }
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Sanie that = (Sanie) o;
        return listaReniferow.equals(that.listaReniferow);
    }
    @Override
    public int hashCode(){
        return listaReniferow.hashCode();
    }
    @Override
    public String toString() {
        return "Sanie{" +
                "Lista reniferów='" + listaReniferow + '\'' +
                '}';
    }

}
