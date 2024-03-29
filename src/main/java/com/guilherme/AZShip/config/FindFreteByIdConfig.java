package com.guilherme.AZShip.config;

import com.guilherme.AZShip.adapters.out.FindFreteByIdAdapter;
import com.guilherme.AZShip.application.core.useCase.FindFreteByIdUseCase;
import com.guilherme.AZShip.application.ports.out.FindFreteByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindFreteByIdConfig {

    @Bean
    public FindFreteByIdUseCase findFreteByIdUseCase(
            FindFreteByIdAdapter findFreteByIdOutputPort
    ) {
        return new FindFreteByIdUseCase(findFreteByIdOutputPort);
    }
}
