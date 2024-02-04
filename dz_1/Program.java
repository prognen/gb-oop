package sems.sem_1.dz;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("tea", 20, 50, 100));
        products.add(new HotDrink("coffee", 30, 60, 60));
        products.add(new HotDrink("hot water", 10, 90, 65));
        products.add(new HotDrink("hot chocolate", 50, 50, 90));
        products.add(new HotDrink("tea", 20, 100, 50));

        HotDrinkVending vending = new HotDrinkVending(products);
        System.out.println(vending.getProduct("tea"));
        System.out.println(vending.getProduct("tea", 100, 50));
    }
}
