package com.guilherme.AZShip.adapters.out.repository.mapper;

import com.guilherme.AZShip.adapters.out.repository.entity.FreteEntity;
import com.guilherme.AZShip.application.core.domain.Frete;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FreteEntityMapper {

    FreteEntity toFreteEntity(Frete frete);
}
