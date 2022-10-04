package be.pxl.ja.robbery;

import be.pxl.ja.citytrip.LondonAttractions;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static final void fill(Knapsack knapsack, Shop shop) {
        Collections.sort(shop.items);
        for (Product product: shop.items) {
            try {
                knapsack.add(product);
            } catch (KnapsackFullException e){
                System.out.println(e.getMessage());
                break;
            }

        }
    }
}
