abstract class UrzadzenieElektroniczne {
    public abstract void napraw();

    public abstract void uzyj();

    public abstract void zepsuj();

    public abstract void wlacz();

    public abstract void wylacz();
}
class mikrofala extends UrzadzenieElektroniczne{
    @Override
    public void napraw(){
        System.out.println(("mikrofala naprawiona"));
    }
    @Override
    public void uzyj(){
        System.out.println(("mikrofala uzyta"));
    }
    @Override
    public void zepsuj(){
        System.out.println(("mikrofala zepsuta"));
    }
    @Override
    public void wlacz(){
        System.out.println(("mikrofala wlaczona"));
    }
    @Override
    public void wylacz(){
        System.out.println(("mikrofala wylaczona"));
    }
}
