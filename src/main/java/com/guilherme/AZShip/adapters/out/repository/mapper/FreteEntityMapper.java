package com.guilherme.AZShip.adapters.out.repository.mapper;

import com.guilherme.AZShip.adapters.out.repository.entity.FreteEntity;
import com.guilherme.AZShip.application.core.domain.Frete;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface FreteEntityMapper {

    FreteEntity toFreteEntity(Frete frete);

    default Page<Frete> toFrete(Page<FreteEntity> freteEntity) {
        return freteEntity.map(this::toFrete);
    }

    Frete toFrete(FreteEntity freteEntity);

}
