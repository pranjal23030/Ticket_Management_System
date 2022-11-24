import model.Booking;
import model.Rate;
import model.Shows;

public class Main {
    public static void main(String[] args) {

        Rate r1 = new Rate(100.89,75,50);
        Rate r2 = new Rate(200, 80, 75);
        Rate r3 = new Rate(450, 67.98, 45);

        Booking b1 = new Booking(300, 540, 3, true);
        Booking b2 = new Booking(400, 650, 5, false);
        Booking b3 = new Booking(600, 700, 8, true);

        Shows s1 = new Shows("Chabahil", "GopiKishna", "Avatar2");
        Shows s2 = new Shows("Kamalpokhari", "Big Movies", "Thor: Love and Thunder");
        Shows s3 = new Shows("KL Tower", "Fcube Cinemas", "Smile");

        String output = s1.getLocation() +"\t"+ s2.getLocation() + " and  "+  s3.getLocation();
        System.out.println("The available location for the shows are: " + output);

        System.out.println("The available rates for the show are: ");
        r1.getrate();
        r2.getrate();
        r3.getrate();

        b1.getTotalcost(true); 


    }
}