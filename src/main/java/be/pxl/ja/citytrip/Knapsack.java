package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.KnapsackFullException;
import be.pxl.ja.robbery.Product;

import java.util.ArrayList;

public class Knapsack {
    double maximumCapacity;
    ArrayList<Attraction> attractions = new ArrayList<Attraction>();
    public Knapsack(double maximumCap) {
        maximumCapacity = maximumCap;
    }
    public double getCurrentWeight(){
        double currentWeight = 0;
        for (Attraction attractionAlreadyInKnapsack: attractions) {
            currentWeight += attractionAlreadyInKnapsack.getWeight();
        }
        return currentWeight;
    }
    public void add(Attraction attraction) throws KnapsackFullException {
        if (attraction.days + this.getCurrentWeight() <= maximumCapacity){
            attractions.add(attraction);
        }
        else {
            throw new KnapsackFullException(attraction.name + " Werd niet toegevoegd max. gewicht overschreden");
        }
    }

    public ArrayList<Attraction> getItems() {
        return attractions;
    }
}
