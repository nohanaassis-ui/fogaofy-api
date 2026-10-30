package com.senai.fogaofy.service;

import com.senai.fogaofy.entity.Prato;
import com.senai.fogaofy.repository.PratoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PratoService {

    private final PratoRepository pratoRepository;

    public PratoService(PratoRepository pratoRepository) {
        this.pratoRepository = pratoRepository;
    }

    public List<Prato> mostrarPrato() {
        List<Prato> pratoList = new ArrayList<>();
        return pratoList = pratoRepository.findAll();
    }


    public void cadastrarPratos(Prato prato){
        Prato prato1 = new Prato();
        prato.setNome(prato.getNome());
        prato.setPreco(prato.getPreco());
        prato.setAvaliacao(prato.getAvaliacao());
        prato.setCategoria(prato.getCategoria());
        prato.setDescricao(prato.getDescricao());
        prato.setLenha(prato.isLenha());
        prato.setIngredientes(prato.getIngredientes());
        prato.setServe(prato.getServe());
        pratoRepository.save(prato);
    }








}