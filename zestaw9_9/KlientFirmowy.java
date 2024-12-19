public class KlientFirmowy extends Klient{
    public final String NIP;
    public final String REGON;

    public KlientFirmowy(String NIP, String REGON){
        this.REGON = REGON;
        this.NIP = NIP;
    }

    public String getREGON(){
        return REGON;
    }
}
