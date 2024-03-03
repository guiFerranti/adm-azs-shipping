package com.guilherme.AZShip.adapters.in.controller;

import com.guilherme.AZShip.adapters.in.controller.mapper.FreteMapper;
import com.guilherme.AZShip.adapters.in.controller.request.FreteRequest;
import com.guilherme.AZShip.application.ports.in.InsertFreteInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fretes")
public class FreteController {

    @Autowired
    private InsertFreteInputPort insertFreteInputPort;

    @Autowired
    private FreteMapper freteMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody FreteRequest freteRequest) {

        var frete = freteMapper.toFrete(freteRequest);

        insertFreteInputPort.insert(frete, freteRequest.getCep(), freteRequest.getNumero());

        return ResponseEntity.ok().build();
    }
}
