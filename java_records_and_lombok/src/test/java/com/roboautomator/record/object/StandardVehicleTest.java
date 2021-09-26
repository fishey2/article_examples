package com.roboautomator.record.object;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StandardVehicleTest {

    @Test
    void shouldBeImmutableDTO() {
        // Given
        var id = UUID.randomUUID();

        // When
        var vehicle = new StandardVehicle(id);

        // Then
        assertEquals(id, vehicle.getId());
    }

    @Test
    void shouldGetToString() {
        // Given
        var id = UUID.randomUUID();

        // When
        var vehicle = new StandardVehicle(id);

        // Then
        var expectedString = "StandardVehicle[id=" + id + "]";
        assertEquals(expectedString, vehicle.toString());
    }

    @Test
    void shouldEqualEachOther() {
        // Given
        var id = UUID.randomUUID();

        // When
        var vehicle1 = new StandardVehicle(id);
        var vehicle2 = new StandardVehicle(id);

        // Then
        assertTrue(vehicle1.equals(vehicle2));
    }

    @Test
    void shouldEqualHashCode() {
        // Given
        var id = UUID.randomUUID();

        // When
        var vehicle1 = new StandardVehicle(id);
        var vehicle2 = new StandardVehicle(id);

        // Then
        assertEquals(vehicle1.hashCode(), vehicle2.hashCode());
    }
}
