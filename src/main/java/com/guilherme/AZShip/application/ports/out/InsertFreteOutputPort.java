package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.application.core.domain.Frete;

public interface InsertFreteOutputPort {

    void insert(Frete frete);
}
