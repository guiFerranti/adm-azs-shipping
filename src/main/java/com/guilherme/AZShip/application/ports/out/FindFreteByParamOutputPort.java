package com.guilherme.AZShip.application.ports.out;

import com.guilherme.AZShip.application.core.domain.Frete;
import org.springframework.data.domain.Page;

public interface FindFreteByParamOutputPort {

    Page<Frete> find(String param);

}
