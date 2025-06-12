package vehicles;

/**
 *
 * @author Leandro Gómez.
 * @version 1.0.0
 */
public class Motorcycle extends Vehicle {

    private String engine = "";
    private int power = 0;
    private String gearbox = "manual";

    public Motorcycle(int year, String name, String model, String brand) {
        super(year, name, model, brand);

    }

    @Override
    public void buildAndShowDescription() {
        description = "Name: " + name + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Color: " + color + "\n" +
                "Engine: " + engine + "\n" +
                "Power: " + power + " hp\n" +
                "Gearbox: " + gearbox + "\n" +
                "Energy source: " + energySource + "\n" +
                "Max speed: " + maxSpeed + " km/h\n" +
                "Weight: " + weight + " kg\n" +
                "Load capacity: " + loadCapacity + " kg\n";

        System.out.println(description);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getGearbox() {
        return gearbox;
    }

}
