package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.internacao.DadosAtualizacaoInternacao;
import com.guiBarao.softCare.internacao.DadosCadastroInternacao;
import com.guiBarao.softCare.internacao.DadosListagemInternacao;
import com.guiBarao.softCare.internacao.Internacao;
import com.guiBarao.softCare.repository.InternacaoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/internacoes")
public class InternacaoController {

    @Autowired
    InternacaoRepository repository;

    @GetMapping
    public List<DadosListagemInternacao> listar()
    {
        return repository.findAll().stream().map(DadosListagemInternacao::new).toList();
    }

    @PostMapping
    @Transactional
    public void internar(@RequestBody DadosCadastroInternacao dados)
    {
        repository.save(new Internacao(dados));
    }

    @PutMapping
    @Transactional
    public void atualizarInfo(@Valid @RequestBody DadosAtualizacaoInternacao dados)
    {
        Internacao internacao = repository.getReferenceById(dados.id());
        internacao.atualizarInfo(dados);
    }



}
