abstract class Owoc {
    public abstract String smak();

    public abstract void umyj();

    public abstract void zjedz();
}

    class Banan extends Owoc{
        @Override
        public String smak(){
            return "słodki";
        }
        @Override
        public void umyj(){
            System.out.println(("Myje banana"));
        }
        @Override
        public void zjedz(){
            System.out.println("Jem banana");
        }
    }
