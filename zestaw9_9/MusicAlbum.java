import java.util.Arrays;

public class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;
    private int count;


    public MusicAlbum(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.ratings = new double[10];
        this.count = 0;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(){
        this.artist = artist;
    }
    public double[] getRatings() {
        return Arrays.copyOf(ratings, count);
    }
    public void addRating(double rating){
        if(count < ratings.length){
            ratings[count] = rating;
            count++;
        }else{
            System.out.println("Nie mozna dodac wiecej ocen");
        }
    }
    public void removeRating(){
        if(count > 0){
            count--;
            ratings[count] = 0;
        }else{
            System.out.println("Brak ocen do usunięcia");
        }
    }

    @Override
    public String toString(){
        return "MusicAlbum{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", ratings='" + Arrays.toString(Arrays.copyOf(ratings, count)) + '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return title.equals(that.title) && artist.equals(that.artist);
    }
    public int hashCode(){
        return title.hashCode() + artist.hashCode();
    }
}

class RockAlbum extends MusicAlbum{
    private String rockGenre;

    public RockAlbum(String title, String artist, String rockGenre){
        super(title, artist);
        this.rockGenre = rockGenre;
    }
    public String getRockGenre(){
        return rockGenre;
    }
    public void setRockGenre(){
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString(){
        return "RockAlbum{" + "title='" + getTitle() + '\'' + ", artist='" + getArtist() + '\'' + ", ratings='" + Arrays.toString(getRatings()) + ", rockGenre='" + rockGenre + '\'' + '}';
    }
    @Override
    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        RockAlbum that = (RockAlbum) o;
        return rockGenre.equals(that.rockGenre);
    }
    public int hashCode(){
        return super.hashCode() + rockGenre.hashCode();
    }
}
