package com.roboautomator.record.lombok;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.NonNull;

import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class ValidatedVehicle {
    @NonNull
    private final UUID id;
}
