package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.out.client.FindAddressByCepClient;
import com.guilherme.AZShip.adapters.out.client.mapper.AddressResponseMapper;
import com.guilherme.AZShip.application.core.domain.Address;
import com.guilherme.AZShip.application.ports.out.FindAddressByCepOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByCepAdapter implements FindAddressByCepOutputPort {

    @Autowired
    private FindAddressByCepClient findAddressByCepClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String cep) {

        var addressResponse = findAddressByCepClient.find(cep);

        return addressResponseMapper.toAddress(addressResponse);
    }
}
