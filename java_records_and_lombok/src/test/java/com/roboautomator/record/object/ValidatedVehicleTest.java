package com.roboautomator.record.object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatedVehicleTest {

    @Test
    void shouldThrowNullPointerException() {
        // Given
        // When
        // Then
        assertThatThrownBy(() -> new ValidatedVehicle(null))
                .isInstanceOf(NullPointerException.class);
    }
}
