package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.application.core.domain.Frete;

import java.util.Optional;

public interface FindFreteByIdOutputPort {
    Optional<Frete> find(long id);
}
