package com.arch.hexagonal.adapters.out.client;

import com.arch.hexagonal.adapters.out.client.response.LocationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${arch.client.address.url}"
)
public interface FindLocationByZipCodeClient {

    @GetMapping("/{zipCode}")
    LocationResponse find(@PathVariable("zipCode") String zipCode);

}
