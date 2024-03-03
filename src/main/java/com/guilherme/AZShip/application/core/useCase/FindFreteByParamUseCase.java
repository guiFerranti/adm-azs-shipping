package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.FindFreteByParamOutputPort;
import org.springframework.data.domain.Page;

public class FindFreteByParamUseCase {

    private final FindFreteByParamOutputPort findFreteByParamOutputPort;

    public FindFreteByParamUseCase(FindFreteByParamOutputPort findFreteByParamOutputPort) {
        this.findFreteByParamOutputPort = findFreteByParamOutputPort;
    }

    public Page<Frete> find(String param) {
        return findFreteByParamOutputPort.find(param);
    }

}
