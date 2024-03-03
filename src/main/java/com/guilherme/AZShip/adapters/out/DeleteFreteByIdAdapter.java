package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.application.ports.out.DeleteFreteByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteFreteByIdAdapter implements DeleteFreteByIdOutputPort {

    @Autowired
    private FreteRepository freteRepository;

    @Override
    public void delete(long id) {
        freteRepository.deleteById(id);
    }
}
