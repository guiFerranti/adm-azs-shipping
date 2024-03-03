package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.in.FindFretesByParamInputPort;
import com.guilherme.AZShip.application.ports.out.FindFreteByParamOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class FindFretesByParamUseCase implements FindFretesByParamInputPort {

    private final FindFreteByParamOutputPort findFreteByParamOutputPort;

    public FindFretesByParamUseCase(FindFreteByParamOutputPort findFreteByParamOutputPort) {
        this.findFreteByParamOutputPort = findFreteByParamOutputPort;
    }

    @Override
    public Page<Frete> find(String param, Pageable pageable) {
        return findFreteByParamOutputPort.find(param, pageable);
    }

}
