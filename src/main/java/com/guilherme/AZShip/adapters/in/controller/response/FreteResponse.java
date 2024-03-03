package com.guilherme.AZShip.adapters.in.controller.response;

import com.guilherme.AZShip.adapters.out.client.response.AddressResponse;
import lombok.Data;

@Data
public class FreteResponse {

    private double peso;

    private double altura;

    private double largura;

    private double comprimento;

    private AddressResponse address;

    private String cpf;

    private String nome;
}