package at.fhj.msd;

public class Show {

    protected int basePrice;
    protected Movie movie;
    protected Hall hall;
    protected int StartTime;
    protected boolean[][] seats;

    public Show(int basePrice, Movie movie, Hall hall, int StartTime) {
        this.basePrice = basePrice;
        this.movie = movie;
        this.hall = hall;
        this.StartTime = StartTime;

        this.seats = new boolean[this.hall.rows][this.hall.seatsPerRow];
    }

    public int calcTicketPrice(int row) {

        int fullPrice = this.basePrice;

        if (row <= 4) {

        }
        else if (row > 4 && row <= 8) {
            fullPrice += 3;
        }

        else if (row > 8) {
            fullPrice += 3;
        }

        if (this.movie.length > 120) {
            fullPrice += 3;
        }

        return fullPrice;

    }

}
