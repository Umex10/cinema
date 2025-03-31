package at.fhj.msd;

public class Hall {


    protected String name;
    protected int rows;
    protected int seatsPerRow;


    public Hall(String name, int rows, int seatsPerRow) {
        this.name = name;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }


    public int getTotalSeats() {
        return rows * seatsPerRow;
    } 
    
}
