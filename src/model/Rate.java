package model;

public class Rate {
    double available_rate;

    public Rate(double available_rate, double popcorn_rate, double extra_charges) {
        this.available_rate = available_rate;
        this.popcorn_rate = popcorn_rate;
        this.extra_charges = extra_charges;
    }

    public double getAvailable_rate() {
        return available_rate;
    }

    public void setAvailable_rate(double available_rate) {
        this.available_rate = available_rate;
    }

    public double getPopcorn_rate() {
        return popcorn_rate;
    }

    public void setPopcorn_rate(double popcorn_rate) {
        this.popcorn_rate = popcorn_rate;
    }

    public double getExtra_charges() {
        return extra_charges;
    }

    public void setExtra_charges(double extra_charges) {
        this.extra_charges = extra_charges;
    }

    double popcorn_rate;
    double extra_charges;

    public void getrate() {
        System.out.println(this.available_rate + this.popcorn_rate + this.extra_charges);
    }
}
