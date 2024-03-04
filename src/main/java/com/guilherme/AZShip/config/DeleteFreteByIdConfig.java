package com.guilherme.AZShip.config;

import com.guilherme.AZShip.adapters.out.DeleteFreteByIdAdapter;
import com.guilherme.AZShip.adapters.out.FindFreteByIdAdapter;
import com.guilherme.AZShip.application.core.useCase.DeleteFreteByIdUseCase;
import com.guilherme.AZShip.application.core.useCase.FindFreteByIdUseCase;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.out.DeleteFreteByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteFreteByIdConfig {

    @Bean
    public DeleteFreteByIdUseCase deleteFreteByIdUseCase(
            FindFreteByIdUseCase findFreteByIdUseCase,
            DeleteFreteByIdAdapter deleteFreteByIdOutputPort
    ) {
        return new DeleteFreteByIdUseCase(findFreteByIdUseCase, deleteFreteByIdOutputPort);
    }
}
