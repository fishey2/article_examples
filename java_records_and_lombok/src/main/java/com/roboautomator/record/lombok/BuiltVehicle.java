package com.roboautomator.record.lombok;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@Builder
@EqualsAndHashCode
@RequiredArgsConstructor
public class BuiltVehicle {
    private final UUID id;
}
