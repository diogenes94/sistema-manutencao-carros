package com.unincor.va1.sistema_manutencao_carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unincor.va1.sistema_manutencao_carros.exceptions.ClienteSalvarException;
import com.unincor.va1.sistema_manutencao_carros.model.domain.Cliente;
import com.unincor.va1.sistema_manutencao_carros.model.service.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente salvar(@Valid @RequestBody Cliente cliente)
            throws ClienteSalvarException {
        return clienteService.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }
}
