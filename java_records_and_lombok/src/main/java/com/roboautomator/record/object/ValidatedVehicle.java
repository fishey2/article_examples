package com.roboautomator.record.object;

import java.util.Objects;
import java.util.UUID;

public class ValidatedVehicle {
    private final UUID id;

    public ValidatedVehicle(UUID id) {
        if(id == null) throw new NullPointerException("id");

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
        ValidatedVehicle vehicle = (ValidatedVehicle) obj;
        return id.equals(vehicle.id);
    }

    @Override
    public String toString() {
        return "StandardVehicle[id=" + id + "]";
    }
}
