package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.in.UpdateFreteInputPort;
import com.guilherme.AZShip.application.ports.out.FindAddressByCepOutputPort;
import com.guilherme.AZShip.application.ports.out.UpdateFreteOutputPort;

public class UpdateFreteUseCase implements UpdateFreteInputPort {

    private final FindFreteByIdInputPort findFreteByIdInputPort;

    private final FindAddressByCepOutputPort findAddressByCepOutputPort;

    private final UpdateFreteOutputPort updateFreteOutputPort;

    public UpdateFreteUseCase(FindFreteByIdInputPort findFreteByIdInputPort, FindAddressByCepOutputPort findAddressByCepOutputPort, UpdateFreteOutputPort updateFreteOutputPort) {
        this.findFreteByIdInputPort = findFreteByIdInputPort;
        this.findAddressByCepOutputPort = findAddressByCepOutputPort;
        this.updateFreteOutputPort = updateFreteOutputPort;
    }

    @Override
    public void update(Frete frete, String cep) {
        findFreteByIdInputPort.find(frete.getId());

        var address = findAddressByCepOutputPort.find(cep);
        frete.setAddress(address);

        updateFreteOutputPort.update(frete);
    }

}
