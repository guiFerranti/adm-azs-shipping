package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.application.core.domain.Address;

public interface FindAddressByCepOutputPort {

    Address find(String cep);

}
