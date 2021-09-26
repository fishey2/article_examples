package com.roboautomator.record.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineTest {

    @Test
    void shouldBuildEngine() {
        // Given
        // When
        var engine = Engine.builder()
                .fuelType(FuelType.DIESEL)
                .build();

        // Then
        assertEquals(engine.fuelType(), FuelType.DIESEL);
    }
}
