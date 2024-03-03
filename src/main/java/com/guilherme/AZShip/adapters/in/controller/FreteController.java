package com.guilherme.AZShip.adapters.in.controller;

import com.guilherme.AZShip.adapters.in.controller.mapper.FreteMapper;
import com.guilherme.AZShip.adapters.in.controller.request.FreteRequest;
import com.guilherme.AZShip.adapters.in.controller.response.FreteResponse;
import com.guilherme.AZShip.application.core.domain.Frete;
import com.guilherme.AZShip.application.ports.in.FindFreteByIdInputPort;
import com.guilherme.AZShip.application.ports.in.FindFretesByParamInputPort;
import com.guilherme.AZShip.application.ports.in.InsertFreteInputPort;
import com.guilherme.AZShip.application.ports.in.UpdateFreteInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fretes")
public class FreteController {

    @Autowired
    private InsertFreteInputPort insertFreteInputPort;

    @Autowired
    private FindFretesByParamInputPort findFretesByParamInputPort;

    @Autowired
    private FindFreteByIdInputPort findFreteByIdInputPort;

    @Autowired
    private UpdateFreteInputPort updateFreteInputPort;

    @Autowired
    private FreteMapper freteMapper;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody FreteRequest freteRequest) {

        var frete = freteMapper.toFrete(freteRequest);

        insertFreteInputPort.insert(frete, freteRequest.getCep(), freteRequest.getNumero());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/search/{param}")
    public ResponseEntity<Page<FreteResponse>> findByParam(@PathVariable final String param,
                                                           Pageable pageable) {

        var fretes = findFretesByParamInputPort.find(param, pageable);
        var fretesResponse = freteMapper.toPageFreteResponse(fretes);

        return ResponseEntity.ok().body(fretesResponse);
    }
    @GetMapping("/{id}")

    public ResponseEntity<FreteResponse> findById(@PathVariable final long id) {

        var frete = findFreteByIdInputPort.find(id);
        var freteResponse = freteMapper.toFreteResponse(frete);

        return ResponseEntity.ok().body(freteResponse);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateById(@PathVariable final long id, @Valid @RequestBody FreteRequest freteRequest) {
        Frete frete = freteMapper.toFrete(freteRequest);
        frete.setId(id);

        updateFreteInputPort.update(frete, freteRequest.getCep());

        return ResponseEntity.noContent().build();
    }
}
