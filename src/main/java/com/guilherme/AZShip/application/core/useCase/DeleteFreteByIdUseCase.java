package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.ports.in.DeleteFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.DeleteFreteByIdOutputPort;

public class DeleteFreteByIdUseCase implements DeleteFreteByIdInputPort {

    private final FindFreteByIdInputPort findFreteByIdInputPort;

    private final DeleteFreteByIdOutputPort deleteFreteByIdOutputPort;

    public DeleteFreteByIdUseCase(FindFreteByIdInputPort findFreteByIdInputPort, DeleteFreteByIdOutputPort deleteFreteByIdOutputPort) {
        this.findFreteByIdInputPort = findFreteByIdInputPort;
        this.deleteFreteByIdOutputPort = deleteFreteByIdOutputPort;
    }

    @Override
    public void delete(long id) {
        findFreteByIdInputPort.find(id);

        deleteFreteByIdOutputPort.delete(id);
    }


}
