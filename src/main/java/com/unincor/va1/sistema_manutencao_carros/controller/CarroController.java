package com.unincor.va1.sistema_manutencao_carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unincor.va1.sistema_manutencao_carros.exceptions.CarroSalvarException;
import com.unincor.va1.sistema_manutencao_carros.model.domain.Carro;
import com.unincor.va1.sistema_manutencao_carros.model.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public Carro salvar(@RequestBody Carro carro) throws CarroSalvarException {
        return carroService.salvar(carro);
    }

    @GetMapping
    public List<Carro> listar() {
        return carroService.listar();
    }
}
