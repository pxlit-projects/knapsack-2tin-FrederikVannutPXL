package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;

public class Attraction implements Comparable<Attraction>{
    String name;
    double days;
    int rating;
    public Attraction(String name, double days, int rating) {
        this.days = days;
        this.name = name;
        this.rating = rating;
    }

    public double getWeight() {
        return days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", rating=" + rating +
                '}';
    }
    @Override
    public int compareTo(Attraction attraction) {
        if (this.rating > attraction.rating) {
            return -1;
        } else if (this.rating == attraction.rating) {
            return 0;
        } else return 1;
    }
}
