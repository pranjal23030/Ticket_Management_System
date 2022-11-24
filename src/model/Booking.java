package model;

public class Booking {
    int rate;

    public Booking(int rate, int cost, int numberofseats, boolean quality) {
        this.rate = rate;
        this.cost = cost;
        this.numberofseats = numberofseats;
        this.quality = quality;
    }

    int cost;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

    public boolean isQuality() {
        return quality;
    }

    public void setQuality(boolean quality) {
        this.quality = quality;
    }

    int numberofseats;
    boolean quality;

    public void getTotalcost(Boolean quality) {

        if(this.quality = quality) {
            System.out.println("The total cost of the show(3d) is " + "Rs." + (this.cost + 50) );
        }
        else {
            System.out.println("The total cost of show is: " + "Rs." + this.cost);
        }
    }
}
