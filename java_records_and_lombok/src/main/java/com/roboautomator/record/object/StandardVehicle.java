package com.roboautomator.record.object;

import java.util.Objects;
import java.util.UUID;

public class StandardVehicle {
    private final UUID id;

    public StandardVehicle(UUID id) {
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
        StandardVehicle vehicle = (StandardVehicle) obj;
        return id.equals(vehicle.id);
    }

    @Override
    public String toString() {
        return "StandardVehicle[id=" + id + "]";
    }
}
