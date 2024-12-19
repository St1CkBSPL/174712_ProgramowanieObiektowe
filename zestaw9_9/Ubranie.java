abstract class Ubranie {
    public abstract void wypierz();

    public abstract void wyprasuj();

    public abstract void zaloz();

    public abstract void wysusz();

    public abstract void zniszcz();
}
class ciuch extends Ubranie{
    @Override
    public void wypierz(){
        System.out.println(("ubranie wyprane"));
    }
    @Override
    public void wyprasuj(){
        System.out.println(("ubranie wyprasowane"));
    }
    @Override
    public void zaloz(){
        System.out.println("ubranie zalozone");
    }
    @Override
    public void wysusz(){
        System.out.println("ubranie wysuszone");
    }
    @Override
    public void zniszcz(){
        System.out.println("ubranie zniszczone");
    }
}