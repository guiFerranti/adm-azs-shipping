package com.guilherme.AZShip.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FreteRequest {

    private double peso;

    private double altura;

    private double largura;

    private double comprimento;

    @NotBlank
    private String cep;

    @Positive
    private int numero;

    @NotBlank
    private String cpf;

    @NotBlank
    private String nome;

}
