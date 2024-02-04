package sems.sem_1.dz;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s with %d volume and %d temperature\n", this.name, this.volume, this.temperature);
    }
}
