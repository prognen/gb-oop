package sems.sem_1.dz;

import java.util.List;

public class HotDrinkVending implements Vending {
    private List<Product> products;
    private int money;

    public HotDrinkVending(List<Product> products) {
        this.products = products;
        this.money = 0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : this.products) {
            if (product instanceof HotDrink && product.getName().equals(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                return product;
            }
        }

        return null;
    }
}
