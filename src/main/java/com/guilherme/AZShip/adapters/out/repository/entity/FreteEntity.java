package com.guilherme.AZShip.adapters.out.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Frete")
@Table(name = "fretes")
public class FreteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double peso;

    private double altura;

    private double largura;

    private double comprimento;

    @Embedded
    private AddressEntity address;

    private String cpf;

    private String nome;


}
