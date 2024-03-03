package com.guilherme.AZShip.adapters.out;

import com.guilherme.AZShip.adapters.in.controller.request.FreteRequest;
import com.guilherme.AZShip.adapters.out.repository.FreteRepository;
import com.guilherme.AZShip.adapters.out.repository.mapper.FreteEntityMapper;
import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.out.FindFreteByParamOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FindFreteByParamAdapter implements FindFreteByParamOutputPort {

    @Autowired
    private FreteRepository freteRepository;

    @Autowired
    private FreteEntityMapper freteEntityMapper;

    @Override
    public Page<Frete> find(String param, Pageable pageable) {

        var freteEntity = freteRepository.findByParamInAllProperties(param, pageable);

        var frete = freteEntityMapper.toFrete(freteEntity);

        return frete;
    }

}
