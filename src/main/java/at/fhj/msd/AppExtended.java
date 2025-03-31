package at.fhj.msd;

import java.util.Scanner;

public class AppExtended {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Hall largeHall = new Hall(10, 12);
        Hall smallHall = new Hall(6, 9);

        Movie antMan = new Movie("Ant-Man and the Wasp: Quantumania", 122, 12);
        Movie magicMike = new Movie("Magic Mike The Last Dance", 113);
        Movie titanic = new Movie("Titanic", 192, 12);

        Show show1 = new Show(5, antMan, largeHall, 1630);
        Show show2 = new Show(4, magicMike, smallHall, 1645);
        Show show3 = new Show(5, titanic, largeHall, 1900);
        Show show4 = new Show(5, titanic, smallHall, 1900);

        Show[] shows = {show1, show2, show3, show4};

        boolean status = true;

        System.out.printf("Welcome to Cinema 3000 Order System. What do you want to do?\n");

        while (status) {

            
            System.out.printf("[L]ist shows\n[s]how available seats for show\n[b]uy a ticket for a show\n");

            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("q")) {
                status = false;
            }

            int count = 1;

            if (choice.equalsIgnoreCase("l")) {
                for (Show s : shows) {
                    System.out.printf("Show %d --> Price: %d; Movie: %s; Hall: %s; Start-Time: %d", count, s.basePrice, s.movie.title, s.hall, s.startTime);
                    count++;
                }
            }
            if (choice.equalsIgnoreCase("s")) {
                System.out.printf("Of which show do you wanna see the free seats? (Integer): ");
                int whichShow = input.nextInt();
                shows[whichShow - 1].printSeatPlan();

            }
            if (choice.equalsIgnoreCase("b")) {
                try {
                    System.out.printf("\nFor which show? (Integer): ");
                    int whichShowTicket = input.nextInt();
                    System.out.printf("\nWhich row and seat? (Seperate it with space): ");
                    String rowAndSeat = input.nextLine();
                    String[] parts = rowAndSeat.split(" ");
                    double ticketPrice = shows[whichShowTicket - 1].buyTicket(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                    System.out.printf("ticket price: %.2f\n", ticketPrice);
                } catch (IllegalArgumentException e) {
                    System.out.println("could not book ticket");
                }
            }

        }

    }
}
