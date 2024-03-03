package com.guilherme.AZShip.adapters.out.repository;

import com.guilherme.AZShip.adapters.out.repository.entity.FreteEntity;
import com.guilherme.AZShip.application.core.domain.Frete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FreteRepository extends JpaRepository<FreteEntity, Long> {

    @Query("SELECT f FROM Frete f WHERE CONCAT(f.peso) = :param OR CONCAT(f.altura) = :param" +
            " OR CONCAT(f.largura) = :param OR f.address.cep = :param OR CONCAT(f.address.numero) = :param" +
            " OR f.address.complemento = :param OR f.nome = :param")
    Page<FreteEntity> findByParamInAllProperties(String param, Pageable pageable);

}
