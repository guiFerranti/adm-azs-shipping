package com.guilherme.AZShip.config;

import com.guilherme.AZShip.application.core.useCase.FindFreteByIdUseCase;
import com.guilherme.AZShip.application.core.useCase.UpdateFreteUseCase;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.FindAddressByCepOutputPort;
import com.guilherme.AZShip.application.ports.out.FindFreteByIdOutputPort;
import com.guilherme.AZShip.application.ports.out.UpdateFreteOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateFreteConfig {


    @Bean
    public UpdateFreteUseCase updateFreteUseCase(
            FindFreteByIdInputPort findFreteByIdInputPort,
            FindAddressByCepOutputPort findAddressByCepOutputPort,
            UpdateFreteOutputPort updateFreteOutputPort
    ) {
        return new UpdateFreteUseCase(findFreteByIdInputPort, findAddressByCepOutputPort, updateFreteOutputPort);
    }
}
