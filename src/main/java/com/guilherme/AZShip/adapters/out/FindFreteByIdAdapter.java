package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.adapters.out.repository.mapper.FreteEntityMapper;
import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.FindFreteByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindFreteByIdAdapter implements FindFreteByIdOutputPort {

    @Autowired
    private FreteRepository freteRepository;

    @Autowired
    private FreteEntityMapper freteEntityMapper;

    @Override
    public Optional<Frete> find(long id) {

        var freteEntity = freteRepository.findById(id);

        return freteEntity.map(ent -> freteEntityMapper.toFrete(ent));

    }
}
