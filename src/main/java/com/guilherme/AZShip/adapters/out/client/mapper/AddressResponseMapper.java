package com.guilherme.AZShip.adapters.out.client.mapper;

import com.guilherme.AZShip.adapters.out.client.response.AddressResponse;
import com.guilherme.AZShip.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
