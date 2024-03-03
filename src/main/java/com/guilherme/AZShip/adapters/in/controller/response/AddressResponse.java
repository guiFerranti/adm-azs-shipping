package com.guilherme.AZShip.adapters.in.controller.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String cep;

    private String logradouro;

    private String complemento;

    private String bairro;

    private String localidade;

    private String uf;

    private int numero;
}
