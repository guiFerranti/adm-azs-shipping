package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.application.core.domain.Frete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindFreteByParamOutputPort {

    Page<Frete> find(String param, Pageable pageable);

}
