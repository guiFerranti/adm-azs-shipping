package com.guilherme.AZShip.adapters.in.controller.mapper;

import com.guilherme.AZShip.adapters.in.controller.request.FreteRequest;
import com.guilherme.AZShip.application.core.domain.Frete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FreteMapper {

    @Mapping(target = "address", ignore = true)
    @Mapping(target = "id", ignore = true)
    Frete toFrete(FreteRequest freteRequest);

}
