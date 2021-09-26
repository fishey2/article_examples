package com.roboautomator.record.object;

import com.roboautomator.record.Printable;
import com.roboautomator.record.Vehicle;
import com.roboautomator.record.util.Engine;
import com.roboautomator.record.util.FuelType;

import java.util.Objects;
import java.util.UUID;

public class PolymorphicVehicle implements Vehicle, Printable {
    private final UUID id;
    private final Engine engine;

    public PolymorphicVehicle(UUID id, Engine engine) {
        this.id = id;
        this.engine = engine;
    }

    public UUID getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean isPetrol() {
        return FuelType.PETROL.equals(engine.fuelType());
    }

    @Override
    public boolean isDiesel() {
        return FuelType.DIESEL.equals(engine.fuelType());
    }

    @Override
    public boolean isElectric() {
        return FuelType.ELECTRIC.equals(engine.fuelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, engine);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PolymorphicVehicle vehicle = (PolymorphicVehicle) obj;
        return id.equals(vehicle.id) && engine.equals(vehicle.getEngine());
    }

    @Override
    public String toString() {
        return "StandardVehicle[id=" + id + ", engine=" + engine + "]";
    }
}
