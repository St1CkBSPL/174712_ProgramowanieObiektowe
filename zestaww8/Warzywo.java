abstract class Warzywo {
    public abstract String smak();

    public abstract String Smak();

    public abstract void umyj();

    public abstract void zjedz();
}
    class Ziemniak extends Warzywo{
        @Override
        public String smak() {
            return "dobry";
        }

        @Override
        public String Smak(){
            return "potrzebuje soli";
        }
        @Override
        public void umyj(){
            System.out.println("myje ziemniaka");
        }
        @Override
        public void zjedz(){
            System.out.println("Jem ziemniaka");
        }
    }
