package be.pxl.ja.robbery;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class KnapsackTest {
    @Test
    public void getCurrentWeighttest(){
        Knapsack knapsack = new Knapsack(100);
        Shop shop = new Shop();
        shop.add(new Product("stereo", 30, 3000));
        shop.add(new Product("tafel", 40, 6000));
        KnapsackUtil.fill(knapsack, shop);
        Assertions.assertEquals(70,knapsack.getCurrentWeight());
    }
    @Test
    public void addFunctionSuccesfullyAdds() throws KnapsackFullException {
        Knapsack knapsack = new Knapsack(100);
        Product product = new  Product("stereo", 30, 3000);
        Product product2 = new  Product("tafel", 50, 5000);
        knapsack.add(product);
        knapsack.add(product2);
        Assertions.assertEquals(2,knapsack.getItems().size());
    }
    @Test
    public void addFunctionShouldNotAddNegativeValues() throws KnapsackFullException {

    }
}
