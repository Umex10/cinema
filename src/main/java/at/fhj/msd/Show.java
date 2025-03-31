package at.fhj.msd;

public class Show {

    private int basePrice; 
    private Movie movie;
    private Hall hall;
    private int StartTime;

    public Show(int basePrice, Movie movie, Hall hall, int StartTime) {
        this.basePrice = basePrice;
        this.movie = movie;
        this.hall = hall;
        this.StartTime = StartTime;
    }
    
}
