package com.arch.hexagonal.application.core.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Location {
    public Location() {

    }

    private String street;
    private String city;
    private String state;

    public Location(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}
