package com.guilherme.AZShip.application.core.useCase;

import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.FindAddressByCepOutputPort;
import com.guilherme.AZShip.application.ports.out.InsertFreteOutputPort;

public class InsertFreteUseCase {

    private final FindAddressByCepOutputPort findAddressByCepOutputPort;

    private final InsertFreteOutputPort insertFreteOutputPort;

    public InsertFreteUseCase(
            FindAddressByCepOutputPort findAddressByCepOutputPort,
            InsertFreteOutputPort insertFreteOutputPort) {
        this.findAddressByCepOutputPort = findAddressByCepOutputPort;
        this.insertFreteOutputPort = insertFreteOutputPort;
    }


    public void insert(Frete frete, String cep, int numero) {
        var address = findAddressByCepOutputPort.find(cep);
        address.setNumero(numero);
        frete.setAddress(address);

        insertFreteOutputPort.insert(frete);
    }

}
