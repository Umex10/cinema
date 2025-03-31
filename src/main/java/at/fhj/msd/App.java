package at.fhj.msd;


public class App {
    public static void main(String[] args) {

        Movie m1 = new Movie("App", 91, 10);
        Hall h1 = new Hall(5, 20);
        Show s1 = new Show(5, m1, h1, 18);
        System.out.println(s1.calcTicketPrice(6));

        s1.printSeatPlan();
       
    }
}
