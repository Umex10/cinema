package at.fhj.msd;

public class Show {

    protected int basePrice; 
    protected Movie movie;
    protected Hall hall;
    protected int StartTime;

    public Show(int basePrice, Movie movie, Hall hall, int StartTime) {
        this.basePrice = basePrice;
        this.movie = movie;
        this.hall = hall;
        this.StartTime = StartTime;
    }

 
}
