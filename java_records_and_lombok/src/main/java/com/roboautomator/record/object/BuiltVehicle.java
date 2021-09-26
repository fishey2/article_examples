package com.roboautomator.record.object;

import java.util.Objects;
import java.util.UUID;

public class BuiltVehicle {
    private final UUID id;

    public BuiltVehicle(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BuiltVehicle vehicle = (BuiltVehicle) obj;
        return id.equals(vehicle.id);
    }

    @Override
    public String toString() {
        return "StandardVehicle[id=" + id + "]";
    }

    public static BuiltVehicleBuilder builder() {
        return new BuiltVehicleBuilder();
    }

    public static class BuiltVehicleBuilder {
        private UUID id;

        private BuiltVehicleBuilder() {
            // Only accessible from static method
        }

        public BuiltVehicleBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BuiltVehicle build() {
            return new BuiltVehicle(id);
        }
    }
}
