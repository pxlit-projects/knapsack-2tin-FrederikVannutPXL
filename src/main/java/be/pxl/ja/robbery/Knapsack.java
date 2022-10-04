package be.pxl.ja.robbery;

import java.util.ArrayList;

public class Knapsack {
    int maximumCapacity;
    ArrayList<Product> products = new ArrayList<Product>();
    public Knapsack(int maximumCap) {
        maximumCapacity = maximumCap;
    }
    public int getCurrentWeight(){
        int currentWeight = 0;
        for (Product productAlreadyInKnapsack: products) {
            currentWeight += productAlreadyInKnapsack.getWeight();
        }
        return currentWeight;
    }
    public void add(Product product) throws KnapsackFullException{
        if (product.weight + this.getCurrentWeight() <= maximumCapacity){
            products.add(product);
        }
        else {
            throw new KnapsackFullException(product.name + " Werd niet toegevoegd max. gewicht overschreden");
        }
    }

    public ArrayList<Product> getItems() {
        return products;
    }
}
