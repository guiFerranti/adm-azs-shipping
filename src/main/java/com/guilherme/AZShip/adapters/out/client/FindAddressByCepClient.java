package com.guilherme.AZShip.adapters.out.client;

import com.guilherme.AZShip.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByCepClient",
        url = "${guilherme.client.address.url}"
)
public interface FindAddressByCepClient {

    @GetMapping("/{cep}")
    AddressResponse find(@PathVariable("cep") String cep);

}
