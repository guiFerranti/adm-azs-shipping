package com.guilherme.AZShip.application.ports.in;

import com.guilherme.AZShip.application.core.domain.Frete;

public interface FindFreteByIdInputPort {

    Frete find(long id);

}
