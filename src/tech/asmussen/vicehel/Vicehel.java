package tech.asmussen.vicehel;

import java.util.regex.Pattern;

/**
 * This abstract class represents a vicehel.
 */
public abstract class Vicehel {
    private boolean hasTowBar;
    private LicenseType licenseType;
    private double engineSize;
    private double kmPerLiter;
    private FuelType fuelType;
    private EnergyClass energyClass;
    private String name;
    private int km;
    private String registrationNumber;
    private int year;
    private int newPrice;

    /**
     * This constructor is used to create a Vicehel object.
     *
     * @param name               - The name of the vicehel.
     * @param km                 - The amount of kilometers the vicehel has driven.
     * @param registrationNumber - The registration number of the vicehel.
     * @param year               - The year the vicehel was manufactured.
     * @param newPrice           - The new price of the vicehel.
     * @param hasTowBar          - Whether the vicehel has a tow-bar.
     * @param licenseType        - The license type of the vicehel.
     * @param engineSize         - The engine size of the vicehel.
     * @param kmPerLiter         - The amount of kilometers the vicehel can drive per liter.
     * @param fuelType           - The fuel type of the vicehel.
     * @param energyClass        - The energy class of the vicehel.
     */
    public Vicehel(String name, int km, String registrationNumber, int year, int newPrice, boolean hasTowBar, LicenseType licenseType, double engineSize, double kmPerLiter, FuelType fuelType, EnergyClass energyClass) {
        this.name = name;
        this.km = km;
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.newPrice = newPrice;
        this.hasTowBar = hasTowBar;
        this.licenseType = licenseType;
        this.engineSize = engineSize;
        this.kmPerLiter = kmPerLiter;
        this.fuelType = fuelType;
        this.energyClass = energyClass;
    }

    /**
     * Returns whether the vicehel has a tow-bar.
     *
     * @return Whether the vicehel has a tow-bar.
     */
    public boolean hasTowBar() {
        return hasTowBar;
    }

    /**
     * Sets whether the vicehel has a tow-bar.
     *
     * @param hasTowBar - Whether the vicehel has a tow-bar.
     */
    public void hasTowBar(boolean hasTowBar) {
        this.hasTowBar = hasTowBar;
    }

    /**
     * Returns the license type of the vicehel.
     *
     * @return The license type of the vicehel.
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the license type of the vicehel.
     *
     * @param licenseType - The license type of the vicehel.
     */
    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Returns the engine size of the vicehel.
     *
     * @return The engine size of the vicehel.
     */
    public double getEngineSize() {
        return engineSize;
    }

    /**
     * Sets the engine size of the vicehel.
     *
     * @param engineSize - The engine size of the vicehel.
     */
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    /**
     * Returns the amount of kilometers the vicehel can drive per liter.
     *
     * @return The amount of kilometers the vicehel can drive per liter.
     */
    public double getKmPerLiter() {
        return kmPerLiter;
    }

    /**
     * Sets the amount of kilometers the vicehel can drive per liter.
     *
     * @param kmPerLiter - The amount of kilometers the vicehel can drive per liter.
     */
    public void setKmPerLiter(double kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    /**
     * Returns the fuel type of the vicehel.
     *
     * @return The fuel type of the vicehel.
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Sets the fuel type of the vicehel.
     *
     * @param fuelType - The fuel type of the vicehel.
     */
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Returns the energy class of the vicehel.
     *
     * @return The energy class of the vicehel.
     */
    public EnergyClass getEnergyClass() {
        return energyClass;
    }

    /**
     * Sets the energy class of the vicehel.
     *
     * @param energyClass - The energy class of the vicehel.
     */
    public void setEnergyClass(EnergyClass energyClass) {
        this.energyClass = energyClass;
    }

    /**
     * Returns the name of the vicehel.
     *
     * @return The name of the vicehel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the vicehel.
     *
     * @param name - The name of the vicehel.
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        this.name = name;
    }

    /**
     * Returns the amount of kilometers the vicehel has driven.
     *
     * @return The amount of kilometers the vicehel has driven.
     */
    public int getKm() {
        return km;
    }

    /**
     * Sets the amount of kilometers the vicehel has driven.
     *
     * @param km - The amount of kilometers the vicehel has driven.
     */
    public void setKm(int km) {
        if (km < 0) {
            throw new IllegalArgumentException("Km cannot be negative!");
        }
        this.km = km;
    }

    /**
     * Returns the registration number of the vicehel.
     *
     * @return The registration number of the vicehel.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the registration number of the vicehel.
     *
     * @param registrationNumber - The registration number of the vicehel.
     */
    public void setRegistrationNumber(String registrationNumber) {
        final Pattern pattern = Pattern.compile("[a-zA-Z]{2}[0-9]{5}");
        if (!pattern.matcher(registrationNumber).matches()) {
            throw new IllegalArgumentException("Registration number must be two letters followed by five numbers!");
        }

        this.registrationNumber = registrationNumber;
    }

    /**
     * Returns the year the vicehel was manufactured.
     *
     * @return The year the vicehel was manufactured.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year the vicehel was manufactured.
     *
     * @param year - The year the vicehel was manufactured.
     */
    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative!");
        }

        this.year = year;
    }

    /**
     * Returns the new price of the vicehel.
     *
     * @return The new price of the vicehel.
     */
    public int getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the new price of the vicehel.
     *
     * @param newPrice - The new price of the vicehel.
     */
    public void setNewPrice(int newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("New price cannot be negative!");
        }

        this.newPrice = newPrice;
    }
}
