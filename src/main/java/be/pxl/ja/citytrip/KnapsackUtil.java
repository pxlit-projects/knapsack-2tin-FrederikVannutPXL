package be.pxl.ja.citytrip;

import be.pxl.ja.citytrip.Knapsack;
import be.pxl.ja.robbery.KnapsackFullException;
import be.pxl.ja.robbery.Product;

import java.util.Collections;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, LondonAttractions attractions) {
        Collections.sort(attractions.items);
        for (Attraction attraction: attractions.items) {
            try {
                knapsack.add(attraction);
            } catch (KnapsackFullException e){
                System.out.println(e.getMessage());
                break;
            }

        }
    }
}
