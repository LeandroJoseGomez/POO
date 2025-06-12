package builder;

import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;

/**
 *
 * @author Leandro Gómez.
 * @version 1.0.0
 */
public class Creator {
    public static void main(String[] args) {

        // Cars.

        Car corolla = new Car(2021, "Corolla", "corolla-2021", "Toyota");
        corolla.setColor("Gray");
        corolla.setEngine("1.8L 4 cylinders");
        corolla.setGearbox("manual");
        corolla.setEnergySource("Gasoline");
        corolla.setPower(139);
        corolla.setLoadCapacity(430);
        corolla.setMaxSpeed(195);
        corolla.setWeight(1310);
        corolla.buildAndShowDescription();

        Car camaro = new Car(2021, "Camaro", "camaro-2021", "Chevrolet");
        camaro.setColor("Blue");
        camaro.setEngine("2.0L Turbo 4 cylinders");
        camaro.setGearbox("manual");
        camaro.setEnergySource("Gasoline");
        camaro.setPower(275);
        camaro.setLoadCapacity(380);
        camaro.setMaxSpeed(250);
        camaro.setWeight(1577);
        camaro.buildAndShowDescription();

        // Trucks.

        Truck peterblit = new Truck(2021, "Peterblit", "579", "Peterblit");
        peterblit.setColor("Red");
        peterblit.setEngine("PACCAR MIX-13");
        peterblit.setEnergySource("Diesel");
        peterblit.setPower(500);
        peterblit.setLoadCapacity(22680);
        peterblit.setMaxSpeed(120);
        peterblit.setWeight(8800);
        peterblit.buildAndShowDescription();

        Truck freightliner = new Truck(2021, "Freightliner", "Cascadia", "Freightliner");
        freightliner.setColor("Black");
        freightliner.setEngine("Detroit DD15");
        freightliner.setEnergySource("Diesel");
        freightliner.setPower(500);
        freightliner.setLoadCapacity(21772);
        freightliner.setMaxSpeed(120);
        freightliner.setWeight(8000);
        freightliner.buildAndShowDescription();

        // Motorcycles.

        Motorcycle kawasaki = new Motorcycle(2021,"Kawasaki", "Ninja ZX-10R", "Kawasaki");
        kawasaki.setColor("Black and gold");
        kawasaki.setEngine("4 stroke DOHC 998cc");
        kawasaki.setEnergySource("Gasoline");
        kawasaki.setPower(203);
        kawasaki.setLoadCapacity(220);
        kawasaki.setMaxSpeed(299);
        kawasaki.setWeight(207);
        kawasaki.buildAndShowDescription();

        Motorcycle harley = new Motorcycle(2021,"Harley-Davidson", "Fat Boy", "Harley-Davidson");
        harley.setColor("Black and silver");
        harley.setEngine("Milwaukee-Eight 114");
        harley.setEnergySource("Gasoline");
        harley.setPower(94);
        harley.setLoadCapacity(220);
        harley.setMaxSpeed(177);
        harley.setWeight(317);
        harley.buildAndShowDescription();

    }
}
