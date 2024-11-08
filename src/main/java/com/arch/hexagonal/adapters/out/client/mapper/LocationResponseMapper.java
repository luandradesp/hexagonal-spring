package com.arantes.hexagonal.adapters.out.client.mapper;

import com.arch.hexagonal.adapters.out.client.response.LocationResponse;
import com.arch.hexagonal.application.core.domain.Location;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationResponseMapper {

    Location toLocation(LocationResponse locationResponse);

}
