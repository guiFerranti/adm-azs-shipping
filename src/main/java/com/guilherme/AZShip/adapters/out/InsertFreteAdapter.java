package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.adapters.out.repository.mapper.FreteEntityMapper;
import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.InsertFreteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertFreteAdapter implements InsertFreteOutputPort {

    @Autowired
    private FreteRepository freteRepository;

    @Autowired
    FreteEntityMapper freteEntityMapper;

    @Override
    public void insert(Frete frete) {

        var freteEntity = freteEntityMapper.toFreteEntity(frete);

        freteRepository.save(freteEntity);
    }
}
