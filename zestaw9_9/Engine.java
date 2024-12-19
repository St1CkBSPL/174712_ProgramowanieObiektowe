import java.util.Arrays;

public class Engine {
    private int power;
    private String type;
    private int SerialNumber;

    public Engine(int power, String type, int SerialNumber){
        this.power = power;
        this.type = type;
        this.SerialNumber = SerialNumber;
    }
    public int getPower(){
        return power;
    }
    public void setPower(){
        this.power = power;
    }
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public int getSerialNumber(){
        return SerialNumber;
    }
    public void setSerialNumber(){
        this.SerialNumber = SerialNumber;
    }
    @Override
    public String toString(){
        return "Engine{" + "power='" + power + '\'' + ", type='" + type + '\'' + ", SerialNumber='" + SerialNumber + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine that = (Engine) o;
        return type.equals(that.type);
    }
    public int hashCode(){
        return type.hashCode();
    }
}
