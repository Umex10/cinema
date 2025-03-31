package at.fhj.msd;


public class App {
    public static void main(String[] args) {

        Hall largeHall = new Hall(10, 12);
        Hall smallHall = new Hall(6, 9);
    
        Movie antMan = new Movie("Ant-Man and the Wasp: Quantumania", 122, 12);
        Movie magicMike = new Movie("Magic Mike The Last Dance", 113);
        Movie titanic = new Movie("Titanic", 192, 12);
    
        Show show1 = new Show(antMan, largeHall, 1630);
        Show show2 = new Show(magicMike, smallHall, 1645);
        Show show3 = new Show(titanic, largeHall, 1900);
        Show show4 = new Show(titanic, smallHall, 1900);
    
        Show[] shows = {show1, show2, show3, show4};
    
    
        
    
    
       
    }
}
