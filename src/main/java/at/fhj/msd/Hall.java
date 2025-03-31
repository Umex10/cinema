package at.fhj.msd;

public class Hall {

    private int rows;
    private int seatsPerRow;


    public Hall(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }


    public int getTotalSeats() {
        return rows * seatsPerRow;
    } 
    
}
