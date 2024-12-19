import java.util.ArrayList;

public class Main {

    ///HOMEWORK!!! zbiór zadań d.19 z. 5 i 11

    public static void main(String[] args) {
        BookDT0 book1 = new BookDT0("Alice in wonderland", "Lewis Carroll",
                19.99, 1865);
        BookDT0 book2 = new BookDT0("Blood of Elves", "Andrzej Sapkowski",
                29.99, 1994);
        BookDT0 book3 = new BookDT0("A Game of Thrones", "George R. R. Martin",
                24.99, 1996);
        System.out.println(book1);

        Address add1 = new Address("Witosa", 5, "18-403", "Olsztyn");
        Person per1 = new Person("Mykel", "Mykelski", -21, add1);

        System.out.println(per1);
        System.out.println("");

        Car c1 = new Car("Subaru", "WRX TR", 5);
        System.out.println(c1);
        System.out.println(c1.fuelCost(7.5, 200));
        System.out.println("");

        BankAccount ba1 = new BankAccount(123456789, 200000);
        System.out.println(ba1);
        System.out.println("");

        ArrayList<Double> rat1 = new ArrayList<Double>();
        rat1.add(9.5);
        rat1.add(8.0);
        rat1.add(8.5);
        rat1.add(9.0);
        rat1.add(10.0);

        MusicAlbum alb1 = new MusicAlbum("Attero Dominatus & Primo Victoria Sampler", "Sabato", rat1);
        MusicAlbum alb2 = new MusicAlbum("Attero Dominatus & Primo Victoria Sampler", "Sabato", rat1);

        System.out.println(alb1.equals(alb2));
        System.out.println(alb1);

        alb1.addRating(7.0);
        alb1.setArtist("Sabaton");
        System.out.println(alb1);

        System.out.println(alb1.getArtist());
        System.out.println(alb1.hashCode());
        System.out.println("");

        RockAlbum ralb1 = new RockAlbum("Highway to Hell", "AC/D", rat1, "heavy metal");
        System.out.println(ralb1.equals(alb2));
        System.out.println(ralb1);

        ralb1.addRating(5.0);
        ralb1.removeRating(7.0);
        ralb1.setRockGenre("hard rock");
        System.out.println(ralb1);

        System.out.println(ralb1.getArtist());
        System.out.println(ralb1.hashCode());
    }
}