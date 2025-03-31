package at.fhj.msd;

public class Movie {

    protected String title;
    protected int length;
    protected int rating;

    public Movie(String title, int length, int rating) {

        this.title = title;
        this.length = length;
        this.rating = rating;

    }

    public Movie(String title, int length) {
        this(title, length, 0);
    }

    
    
}
