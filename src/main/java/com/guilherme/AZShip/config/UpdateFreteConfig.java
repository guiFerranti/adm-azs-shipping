package com.guilherme.AZShip.config;

import com.guilherme.AZShip.adapters.out.FindAddressByCepAdapter;
import com.guilherme.AZShip.adapters.out.FindFreteByIdAdapter;
import com.guilherme.AZShip.adapters.out.UpdateFreteAdapter;
import com.guilherme.AZShip.application.core.useCase.FindFreteByIdUseCase;
import com.guilherme.AZShip.application.core.useCase.UpdateFreteUseCase;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.FindAddressByCepOutputPort;
import com.guilherme.AZShip.application.ports.out.UpdateFreteOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateFreteConfig {


    @Bean
    public UpdateFreteUseCase updateFreteUseCase(
            FindFreteByIdUseCase findFreteByIdUseCase,
            FindAddressByCepAdapter findAddressByCepOutputPort,
            UpdateFreteAdapter updateFreteOutputPort
    ) {
        return new UpdateFreteUseCase(findFreteByIdUseCase, findAddressByCepOutputPort, updateFreteOutputPort);
    }
}
