public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Kamil", 18, "magazynier");
        System.out.println(elf.przedstawSie());
        Renifer renifer = new Renifer("Rudolf", 50);
        System.out.println(renifer.nakarmRenifera());
        Fabryka fabryka = new Fabryka(200, 30);
        fabryka.setDlGeo(50);
        System.out.println(fabryka.toString());
    }
}