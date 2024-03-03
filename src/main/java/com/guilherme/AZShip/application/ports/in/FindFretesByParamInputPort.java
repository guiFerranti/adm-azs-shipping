package com.guilherme.AZShip.application.ports.in;

import com.guilherme.AZShip.application.core.domain.Frete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindFretesByParamInputPort {

    Page<Frete> find(String id, Pageable pageable);
}
