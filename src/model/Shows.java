package model;

public class Shows {
    String location;

    public Shows(String location, String hall_name, String movie_name) {
        this.location = location;
        this.hall_name = hall_name;
        this.movie_name = movie_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    String hall_name;
    String movie_name;

    public void getlocation() {

        System.out.println(this.location);
    }

}
