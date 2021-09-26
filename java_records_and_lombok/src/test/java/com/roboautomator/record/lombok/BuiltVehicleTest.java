package com.roboautomator.record.lombok;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuiltVehicleTest {

    @Test
    void shouldBuildVehicle() {
        // Given
        var id = UUID.randomUUID();

        // When
        var vehicle = BuiltVehicle.builder()
                .id(id)
                .build();

        // Then
        assertEquals(id, vehicle.getId());
    }
}
