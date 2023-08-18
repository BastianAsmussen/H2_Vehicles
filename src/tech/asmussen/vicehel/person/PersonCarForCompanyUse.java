package tech.asmussen.vicehel.person;

import tech.asmussen.vicehel.Dimension;
import tech.asmussen.vicehel.EnergyClass;
import tech.asmussen.vicehel.FuelType;
import tech.asmussen.vicehel.LicenseType;

/**
 * This class is a subclass of PersonCar and is used to create a PersonCarForCompanyUse object.
 */
public class PersonCarForCompanyUse extends PersonCar {
    private boolean hasSafetyBar;
    private int loadCapacity;

    /**
     * This constructor is used to create a PersonCarForCompanyUse object.
     * @param name - The name of the car.
     * @param km - The amount of kilometers the car has driven.
     * @param registrationNumber - The registration number of the car.
     * @param year - The year the car was manufactured.
     * @param newPrice - The new price of the car.
     * @param hasTowBar - Whether the car has a tow-bar.
     * @param licenseType - The license type of the car.
     * @param engineSize - The engine size of the car.
     * @param kmPerLiter - The amount of kilometers the car can drive per liter.
     * @param fuelType - The fuel type of the car.
     * @param energyClass - The energy class of the car.
     * @param numberOfSeats - The amount of seats the car has.
     * @param backseatCapacities - The dimensions of the backseats of the car.
     * @param hasSafetyBar - Whether the car has a safety bar.
     * @param loadCapacity - The load capacity of the car.
     */
    public PersonCarForCompanyUse(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass, int numberOfSeats, Dimension backseatCapacities, boolean hasSafetyBar, int loadCapacity) {
        super(name, km, registrationNumber, year, newPrice, hasTowBar, licenseType, engineSize, kmPerLiter, fuelType, energyClass, numberOfSeats, backseatCapacities);
        this.hasSafetyBar = hasSafetyBar;
        this.loadCapacity = loadCapacity;
    }

    /**
     * Returns whether the car has a safety bar.
     *
     * @return Whether the car has a safety bar.
     */
    public boolean hasSafetyBar() {
        return hasSafetyBar;
    }

    /**
     * Sets whether the car has a safety bar.
     *
     * @param hasSafetyBar - Whether the car has a safety bar.
     */
    public void hasSafetyBar(boolean hasSafetyBar) {
        this.hasSafetyBar = hasSafetyBar;
    }

    /**
     * Returns the load capacity of the car.
     *
     * @return The load capacity of the car.
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets the load capacity of the car.
     *
     * @param loadCapacity - The load capacity of the car.
     */
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " (Company Use)";
    }
}
