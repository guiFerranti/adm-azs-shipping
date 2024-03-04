package com.guilherme.AZShip.config;

import com.guilherme.AZShip.adapters.out.FindFreteByParamAdapter;
import com.guilherme.AZShip.application.core.useCase.FindFretesByParamUseCase;
import com.guilherme.AZShip.application.ports.out.FindFreteByParamOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindFretesByParamConfig {

    @Bean
    public FindFretesByParamUseCase findFretesByParamUseCase(
            FindFreteByParamAdapter findFreteByParamOutputPort
    ) {
        return new FindFretesByParamUseCase(findFreteByParamOutputPort);
    }
}
