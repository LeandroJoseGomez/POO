package vehicles;

/**
 *
 * @author Leandro Gómez.
 * @version 1.0.0
 */
public abstract class Vehicle {

    protected String brand;
    protected String color = "";
    protected String description = "";
    protected String energySource = "";
    protected String model;
    protected String name;
    protected int maxSpeed = 0;
    protected int loadCapacity = 0;
    protected int weight = 0;
    protected int year;

    public Vehicle(int year, String name, String model, String brand){
        this.year = year;
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public abstract void buildAndShowDescription();

}
