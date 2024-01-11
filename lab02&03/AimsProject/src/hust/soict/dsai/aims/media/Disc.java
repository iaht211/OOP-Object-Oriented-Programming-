package hust.soict.dsai.aims.media;

public class Disc extends Media{
    private int length;
    private String director;

    public Disc() {
        super();
    }
    public Disc(String director, int length) {
        this.length = length;
        this.director = director;
    }
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Disc(String title, int length, String director) {
        super(title);
        this.length = length;
        this.director = director;
    }
    public Disc(int length, String director, String title, String category, float cost) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
