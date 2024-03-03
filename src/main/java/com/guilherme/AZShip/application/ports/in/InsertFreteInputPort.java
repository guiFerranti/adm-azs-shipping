package com.guilherme.AZShip.application.ports.in;

import com.guilherme.AZShip.application.core.domain.Frete;

public interface InsertFreteInputPort {

    void insert(Frete frete, String cep, int numero);
}
