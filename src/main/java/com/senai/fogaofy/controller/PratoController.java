package com.senai.fogaofy.controller;

import com.senai.fogaofy.entity.Prato;
import com.senai.fogaofy.service.PratoService;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pratos")
public class PratoController {

    private final PratoService pratoService;

    public PratoController(PratoService pratoService) {
        this.pratoService = pratoService;
    }


    @GetMapping
    public List<Prato> mostrarPratos(){
        return pratoService.mostrarPrato();
    }

    @PostMapping
    public void criarPrato(@RequestBody Prato prato){
        pratoService.cadastrarPratos(prato);
    }
}
