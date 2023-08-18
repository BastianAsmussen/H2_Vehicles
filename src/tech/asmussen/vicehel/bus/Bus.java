package tech.asmussen.vicehel.bus;

import tech.asmussen.vicehel.EnergyClass;
import tech.asmussen.vicehel.FuelType;
import tech.asmussen.vicehel.LicenseType;
import tech.asmussen.vicehel.Vicehel;

/**
 * This class represents a bus.
 */
public class Bus extends Vicehel {
    private int seatCount;
    private int sleepingCount;
    private boolean hasToilet;
    private double height;
    private double weight;
    private double length;

    /**
     * Constructor for the Bus class.
     *
     * @param name               - The name of the bus.
     * @param km                 - The amount of kilometers the bus has driven.
     * @param registrationNumber - The registration number of the bus.
     * @param year               - The year the bus was manufactured.
     * @param newPrice           - The new price of the bus.
     * @param hasTowBar          - Whether the bus has a tow-bar.
     * @param licenseType        - The license type of the bus.
     * @param engineSize         - The engine size of the bus.
     * @param kmPerLiter         - The amount of kilometers the bus can drive per liter.
     * @param fuelType           - The fuel type of the bus.
     * @param energyClass        - The energy class of the bus.
     * @param seatCount          - The amount of seats the bus has.
     * @param sleepingCount      - The amount of sleeping seats the bus has.
     * @param hasToilet          - Whether the bus has a toilet.
     * @param height             - The height of the bus.
     * @param weight             - The weight of the bus.
     * @param length             - The length of the bus.
     */
    public Bus(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass, int seatCount, int sleepingCount, boolean hasToilet, double height, double weight, double length) {
        super(name, km, registrationNumber, year, newPrice, hasTowBar, licenseType, engineSize, kmPerLiter, fuelType, energyClass);
        this.seatCount = seatCount;
        this.sleepingCount = sleepingCount;
        this.hasToilet = hasToilet;
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    /**
     * Returns the amount of seats the bus has.
     *
     * @return The amount of seats the bus has.
     */
    public int getSeatCount() {
        return seatCount;
    }

    /**
     * Sets the amount of seats the bus has.
     *
     * @param seatCount - The amount of seats the bus has.
     * @throws IllegalArgumentException - If the seat count is negative.
     */
    public void setSeatCount(int seatCount) {
        if (seatCount < 0) {
            throw new IllegalArgumentException("Seat count cannot be negative!");
        }

        this.seatCount = seatCount;
    }

    /**
     * Returns the amount of sleeping seats the bus has.
     *
     * @return The amount of sleeping seats the bus has.
     */
    public int getSleepingCount() {
        return sleepingCount;
    }

    /**
     * Sets the amount of sleeping seats the bus has.
     *
     * @param sleepingCount - The amount of sleeping seats the bus has.
     * @throws IllegalArgumentException - If the sleeping count is negative.
     */
    public void setSleepingCount(int sleepingCount) {
        if (sleepingCount < 0) {
            throw new IllegalArgumentException("Sleeping count cannot be negative!");
        }

        this.sleepingCount = sleepingCount;
    }

    /**
     * Returns whether the bus has a toilet.
     *
     * @return Whether the bus has a toilet.
     */
    public boolean hasToilet() {
        return hasToilet;
    }

    /**
     * Sets whether the bus has a toilet.
     *
     * @param hasToilet - Whether the bus has a toilet.
     */
    public void hasToilet(boolean hasToilet) {
        this.hasToilet = hasToilet;
    }

    /**
     * Returns the height of the bus.
     *
     * @return The height of the bus.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the bus.
     *
     * @param height - The height of the bus.
     * @throws IllegalArgumentException - If the height is negative.
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative!");
        }

        this.height = height;
    }

    /**
     * Returns the weight of the bus.
     *
     * @return The weight of the bus.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the bus.
     *
     * @param weight - The weight of the bus.
     * @throws IllegalArgumentException - If the weight is negative.
     */
    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative!");
        }

        this.weight = weight;
    }

    /**
     * Returns the length of the bus.
     *
     * @return The length of the bus.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the bus.
     *
     * @param length - The length of the bus.
     * @throws IllegalArgumentException - If the length is negative.
     */
    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative!");
        }

        this.length = length;
    }

    @Override
    public String toString() {
        return "Bus: " + getName() + " (" + getRegistrationNumber() + ")";
    }
}
