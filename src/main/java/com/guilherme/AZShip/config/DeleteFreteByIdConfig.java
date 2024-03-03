package com.guilherme.AZShip.config;

import com.guilherme.AZShip.application.core.useCase.DeleteFreteByIdUseCase;
import com.guilherme.AZShip.application.core.useCase.FindFreteByIdUseCase;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.DeleteFreteByIdOutputPort;
import com.guilherme.AZShip.application.ports.out.FindFreteByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteFreteByIdConfig {

    @Bean
    public DeleteFreteByIdUseCase deleteFreteByIdUseCase(
            FindFreteByIdInputPort findFreteByIdInputPort,
            DeleteFreteByIdOutputPort deleteFreteByIdOutputPort
    ) {
        return new DeleteFreteByIdUseCase(findFreteByIdInputPort, deleteFreteByIdOutputPort);
    }
}
