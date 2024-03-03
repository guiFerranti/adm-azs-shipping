package com.guilherme.AZShip.config;

import com.guilherme.AZShip.adapters.out.FindAddressByCepAdapter;
import com.guilherme.AZShip.adapters.out.InsertFreteAdapter;
import com.guilherme.AZShip.application.core.useCase.InsertFreteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertFreteConfig {

    @Bean
    public InsertFreteUseCase insertFreteUseCase(
            FindAddressByCepAdapter findAddressByCepAdapter,
            InsertFreteAdapter insertFreteAdapter
    ) {
        return new InsertFreteUseCase(findAddressByCepAdapter, insertFreteAdapter);
    }
}
