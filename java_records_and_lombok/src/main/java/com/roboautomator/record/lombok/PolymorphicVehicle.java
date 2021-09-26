package com.roboautomator.record.lombok;

import com.roboautomator.record.Printable;
import com.roboautomator.record.Vehicle;
import com.roboautomator.record.util.Engine;
import com.roboautomator.record.util.FuelType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class PolymorphicVehicle implements Vehicle, Printable {
    private final UUID id;
    private final Engine engine;

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
}
