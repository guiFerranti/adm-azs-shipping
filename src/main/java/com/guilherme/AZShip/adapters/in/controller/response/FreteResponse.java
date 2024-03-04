package com.guilherme.AZShip.adapters.in.controller.response;

import lombok.Data;

@Data
public class FreteResponse {

    private long id;

    private double peso;

    private double altura;

    private double largura;

    private double comprimento;

    private AddressResponse address;

    private String cpf;

    private String nome;
}
