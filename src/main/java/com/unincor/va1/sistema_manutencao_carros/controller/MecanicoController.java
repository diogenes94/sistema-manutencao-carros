package com.unincor.va1.sistema_manutencao_carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unincor.va1.sistema_manutencao_carros.exceptions.MecanicoSalvarException;
import com.unincor.va1.sistema_manutencao_carros.model.domain.Mecanico;
import com.unincor.va1.sistema_manutencao_carros.model.service.MecanicoService;

@RestController
@RequestMapping("/mecanico")
public class MecanicoController {

    @Autowired
    private MecanicoService mecanicoService;

    @PostMapping
    public Mecanico salvar(@RequestBody Mecanico mecanico)
            throws MecanicoSalvarException {
        return mecanicoService.salvarMecanico(mecanico);
    }

    @GetMapping
    public List<Mecanico> listar() {
        return mecanicoService.listarMecanicos();
    } 
    
}
