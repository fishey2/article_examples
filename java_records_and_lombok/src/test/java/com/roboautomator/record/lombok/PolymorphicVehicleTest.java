package com.roboautomator.record.lombok;

import com.roboautomator.record.Printable;
import com.roboautomator.record.Vehicle;
import com.roboautomator.record.util.Engine;
import com.roboautomator.record.util.FuelType;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PolymorphicVehicleTest {

    @Test
    void shouldReturnTrueIfDieselWhenIsDieselCalled() {
        // Given
        var engine = Engine.builder()
                .fuelType(FuelType.DIESEL)
                .build();

        // When
        Vehicle vehicle = new PolymorphicVehicle(
                UUID.randomUUID(),
                engine
        );

        // Then
        assertTrue(vehicle.isDiesel());
        assertFalse(vehicle.isPetrol());
        assertFalse(vehicle.isElectric());
    }

    @Test
    void shouldBePrintable() {
        // Given
        var engine = Engine.builder()
                .fuelType(FuelType.DIESEL)
                .build();

        // When
        Printable vehicle = new PolymorphicVehicle(
                UUID.randomUUID(),
                engine
        );

        // Then
        assertDoesNotThrow(vehicle::print);
    }
}
