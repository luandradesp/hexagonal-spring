package com.arch.hexagonal.adapters.out.client;

import com.arch.hexagonal.adapters.out.client.response.LocationResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



public interface FindLocationByZipCodeClient {

    @GetMapping("/{zipCode}")
    LocationResponse find(@PathVariable("zipCode") String zipCode);

}
