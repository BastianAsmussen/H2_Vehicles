package tech.asmussen.vicehel.person;

import tech.asmussen.vicehel.*;

/**
 * This class is used to create a PersonCar object.
 */
public class PersonCar extends Vicehel {
    private int numberOfSeats;
    private Dimension backseatDimensions;

    /**
     * This constructor is used to create a PersonCar object.
     *
     * @param name               - The name of the car.
     * @param km                 - The amount of kilometers the car has driven.
     * @param registrationNumber - The registration number of the car.
     * @param year               - The year the car was manufactured.
     * @param newPrice           - The new price of the car.
     * @param hasTowBar          - Whether the car has a tow-bar.
     * @param licenseType        - The license type of the car.
     * @param engineSize         - The engine size of the car.
     * @param kmPerLiter         - The amount of kilometers the car can drive per liter.
     * @param fuelType           - The fuel type of the car.
     * @param energyClass        - The energy class of the car.
     * @param numberOfSeats      - The amount of seats the car has.
     * @param backseatDimensions - The dimensions of the backseats of the car.
     */
    public PersonCar(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass, int numberOfSeats, Dimension backseatDimensions) {
        super(name, km, registrationNumber, year, newPrice, hasTowBar, licenseType, engineSize, kmPerLiter, fuelType, energyClass);

        this.numberOfSeats = numberOfSeats;
        this.backseatDimensions = backseatDimensions;
    }

    /**
     * Returns the amount of seats the car has.
     *
     * @return The amount of seats the car has.
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the amount of seats the car has.
     *
     * @param numberOfSeats - The amount of seats the car has.
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Returns the dimensions of the backseats of the car.
     *
     * @return The dimensions of the backseats of the car.
     */
    public Dimension getBackseatDimensions() {
        return backseatDimensions;
    }

    /**
     * Sets the dimensions of the backseats of the car.
     *
     * @param backseatDimensions - The dimensions of the backseats of the car.
     */
    public void setBackseatDimensions(Dimension backseatDimensions) {
        this.backseatDimensions = backseatDimensions;
    }

    @Override
    public String toString() {
        return "Person Car: " + getName() + " (" + getRegistrationNumber() + ")";
    }
}
