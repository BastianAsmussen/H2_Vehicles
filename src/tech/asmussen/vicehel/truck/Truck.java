package tech.asmussen.vicehel.truck;

import tech.asmussen.vicehel.EnergyClass;
import tech.asmussen.vicehel.FuelType;
import tech.asmussen.vicehel.LicenseType;
import tech.asmussen.vicehel.Vicehel;

/**
 * This class represents a truck.
 */
public class Truck extends Vicehel {
    private int maxLoad;
    private double height;
    private double weight;
    private double length;

    /**
     * Constructor for the Truck class.
     * @param name - The name of the truck.
     * @param km - The amount of kilometers the truck has driven.
     * @param registrationNumber - The registration number of the truck.
     * @param year - The year the truck was manufactured.
     * @param newPrice - The new price of the truck.
     * @param hasTowBar - Whether the truck has a tow-bar.
     * @param licenseType - The license type of the truck.
     * @param engineSize - The engine size of the truck.
     * @param kmPerLiter - The amount of kilometers the truck can drive per liter.
     * @param fuelType - The fuel type of the truck.
     * @param energyClass - The energy class of the truck.
     * @param maxLoad - The maximum load of the truck.
     * @param height - The height of the truck.
     * @param weight - The weight of the truck.
     * @param length - The length of the truck.
     */
    public Truck(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass, int maxLoad, double height, double weight, double length) {
        super(name, km, registrationNumber, year, newPrice, hasTowBar, licenseType, engineSize, kmPerLiter, fuelType, energyClass);
        this.maxLoad = maxLoad;
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    /**
     * Returns the maximum load of the truck.
     * @return The maximum load of the truck.
     */
    public int getMaxLoad() {
        return maxLoad;
    }

    /**
     * Sets the maximum load of the truck.
     * @param maxLoad - The maximum load of the truck.
     */
    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * Returns the height of the truck.
     * @return The height of the truck.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the truck.
     * @param height - The height of the truck.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the weight of the truck.
     * @return The weight of the truck.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the truck.
     * @param weight - The weight of the truck.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the length of the truck.
     * @return The length of the truck.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the truck.
     * @param length - The length of the truck.
     */
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Truck: " + getName() + " (" + getRegistrationNumber() + ")";
    }
}
