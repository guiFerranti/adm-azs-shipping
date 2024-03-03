package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.application.core.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;

public interface FindAddressByCepOutputPort {

    Address find(String cep);

}
