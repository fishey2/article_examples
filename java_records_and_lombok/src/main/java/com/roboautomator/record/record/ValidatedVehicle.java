package com.roboautomator.record.record;

import java.util.UUID;

record ValidatedVehicle(UUID id)  {
    ValidatedVehicle {
        if (id == null) throw new NullPointerException("id");
    }
}
