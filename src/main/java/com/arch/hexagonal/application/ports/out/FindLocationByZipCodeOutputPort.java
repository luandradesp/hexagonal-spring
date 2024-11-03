package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Location;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(
        name = "FindLocationByCodeOutputPort",
        url= "${arch.cliente.address.url}"
)
@Component
public interface FindLocationByZipCodeOutputPort {

    Location find(String zipcode);

}

