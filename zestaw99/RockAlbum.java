import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    String rockGenre;

    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return "RockAlbum{" +
                "rockGenre='" + rockGenre + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
