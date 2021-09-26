package com.roboautomator.record.record;

import com.roboautomator.record.Printable;
import com.roboautomator.record.Vehicle;
import com.roboautomator.record.util.Engine;
import com.roboautomator.record.util.FuelType;

import java.util.UUID;

record PolymorphicVehicle(UUID id, Engine engine) implements Vehicle, Printable {

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean isPetrol() {
        return FuelType.PETROL.equals(fuelType());
    }

    @Override
    public boolean isDiesel() {
        return FuelType.DIESEL.equals(fuelType());
    }

    @Override
    public boolean isElectric() {
        return FuelType.ELECTRIC.equals(fuelType());
    }

    // Encapsulation example
    private FuelType fuelType() {
        return engine.fuelType();
    }
}
