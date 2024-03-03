package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.adapters.out.repository.mapper.FreteEntityMapper;
import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.UpdateFreteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateFreteAdapter implements UpdateFreteOutputPort {

    @Autowired
    private FreteRepository freteRepository;

    @Autowired
    private FreteEntityMapper freteEntityMapper;

    @Override
    public void update(Frete frete) {
        var freteEntity = freteEntityMapper.toFreteEntity(frete);

        freteRepository.save(freteEntity);
    }
}
