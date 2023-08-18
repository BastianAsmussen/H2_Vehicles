package tech.asmussen.vicehel.person;

import tech.asmussen.vicehel.Dimension;
import tech.asmussen.vicehel.EnergyClass;
import tech.asmussen.vicehel.FuelType;
import tech.asmussen.vicehel.LicenseType;

/**
 * This class is used to create a PersonCarForPrivateUse object.
 */
public class PersonCarForPrivateUse extends PersonCar {
    private boolean hasIsoFix;

/**
     * This constructor is used to create a PersonCarForPrivateUse object.
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
     * @param backseatCapacities - The dimensions of the backseats of the car.
     * @param hasIsoFix          - Whether the car has IsoFix.
     */
    public PersonCarForPrivateUse(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass, int numberOfSeats, Dimension backseatCapacities, boolean hasIsoFix) {
        super(name, km, registrationNumber, year, newPrice, hasTowBar, licenseType, engineSize, kmPerLiter, fuelType, energyClass, numberOfSeats, backseatCapacities);

        this.hasIsoFix = hasIsoFix;
    }

    /**
     * Returns whether the car has IsoFix.
     *
     * @return Whether the car has IsoFix.
     */
    public boolean hasIsoFix() {
        return hasIsoFix;
    }

    /**
     * Sets whether the car has IsoFix.
     *
     * @param hasIsoFix - Whether the car has IsoFix.
     */
    public void hasIsoFix(boolean hasIsoFix) {
        this.hasIsoFix = hasIsoFix;
    }

    @Override
    public String toString() {
        return super.toString() + " (Private Use)";
    }
}
