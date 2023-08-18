package tech.asmussen;

import tech.asmussen.vicehel.Dimension;
import tech.asmussen.vicehel.EnergyClass;
import tech.asmussen.vicehel.FuelType;
import tech.asmussen.vicehel.LicenseType;
import tech.asmussen.vicehel.bus.Bus;
import tech.asmussen.vicehel.person.PersonCarForPrivateUse;
import tech.asmussen.vicehel.truck.Truck;

public class Main {
    public static void main(String[] args) {
        PersonCarForPrivateUse personCar1 = new PersonCarForPrivateUse(
                "VW Golf", 50000, "AB12345", 2018, 250000, false,
                LicenseType.B, 1.6, 18.5, FuelType.BENZIN,
                EnergyClass.B, 5, new Dimension(2.2, 1.5, 1.3), true
        );

        System.out.println(personCar1);
        System.out.println("Antal sæder: " + personCar1.getNumberOfSeats());
        System.out.println("Bagagerums dimensioner: " + personCar1.getBackseatDimensions());
        System.out.println("Isofix beslag: " + personCar1.hasIsoFix());

        System.out.println();

        Truck truck1 = new Truck(
                "Scania R450", 150000, "CD67890", 2020, 500000, true,
                LicenseType.CE, 13.0, 4.8, FuelType.DIESEL,
                EnergyClass.C, 25000, 4.0, 12000.0, 10.0
        );

        System.out.println(truck1);
        System.out.println("Max lasteevne: " + truck1.getMaxLoad() + " kg");
        System.out.println("Højde: " + truck1.getHeight() + " m");
        System.out.println("Vægt: " + truck1.getWeight() + " kg");
        System.out.println("Længde: " + truck1.getLength() + " m");

        System.out.println();

        Bus bus1 = new Bus(
                "Mercedes-Benz Tourismo", 200000, "EF54321", 2019, 800000, false,
                LicenseType.D, 11.0, 6.5, FuelType.DIESEL,
                EnergyClass.B, 50, 10, true, 4.2, 18000.0, 12.0
        );

        System.out.println(bus1);
        System.out.println("Antal siddepladser: " + bus1.getSeatCount());
        System.out.println("Antal sovepladser: " + bus1.getSleepingCount());
        System.out.println("Toilet: " + (bus1.hasToilet() ? "Ja" : "Nej"));
        System.out.println("Højde: " + bus1.getHeight() + " m");
        System.out.println("Vægt: " + bus1.getWeight() + " kg");
        System.out.println("Længde: " + bus1.getLength() + " m");
    }
}
