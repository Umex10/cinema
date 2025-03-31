package at.fhj.msd;

public class Hall {

    protected int rows;
    protected int seatsPerRow;


    public Hall(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }


    public int getTotalSeats() {
        return rows * seatsPerRow;
    } 
    
}
