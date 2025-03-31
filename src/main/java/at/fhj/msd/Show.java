package at.fhj.msd;

public class Show {

    protected int basePrice;
    protected Movie movie;
    protected Hall hall;
    protected int startTime;
    protected boolean[][] seats;

    public Show(int basePrice, Movie movie, Hall hall, int startTime) {
        this.basePrice = basePrice;
        this.movie = movie;
        this.hall = hall;
        this.startTime = startTime;

        this.seats = new boolean[this.hall.rows][this.hall.seatsPerRow];
    }

    public int calcTicketPrice(int row) {

        int fullPrice = this.basePrice;

        if (row <= 4) {

        } else if (row > 4 && row <= 8) {
            fullPrice += 3;
        } else if (row > 8) {
            fullPrice += 3;
        }

        if (this.movie.length > 120) {
            fullPrice += 3;
        }

        return fullPrice;

    }

    public void printSeatPlan() {
        System.out.printf("Show '%s' at '%d'\n\n", this.movie.title, this.startTime);

        for (int row = 0; row < this.seats.length; row++) {
            for (int col = 0; col < this.seats[row].length; col++) {
                if (this.seats[row][col]) {
                    System.out.print("x ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
