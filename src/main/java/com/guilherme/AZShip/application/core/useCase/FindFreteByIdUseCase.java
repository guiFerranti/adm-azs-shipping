package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.FindFreteByIdOutputPort;

public class FindFreteByIdUseCase implements FindFreteByIdInputPort {

    private final FindFreteByIdOutputPort findFreteByIdOutputPort;

    public FindFreteByIdUseCase(FindFreteByIdOutputPort findFreteByIdOutputPort) {
        this.findFreteByIdOutputPort = findFreteByIdOutputPort;
    }

    @Override
    public Frete find(long id){

        return findFreteByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Frete not found"));
    }
}
