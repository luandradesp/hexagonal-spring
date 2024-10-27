package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Location;

public interface FindLocationByCodeOutputPort {
    Location find(String zipCode);
}
