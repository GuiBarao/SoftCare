package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.consulta.Consulta;
import com.guiBarao.softCare.consulta.DadosAtualizacaoConsulta;
import com.guiBarao.softCare.consulta.DadosCadastroConsulta;
import com.guiBarao.softCare.consulta.DadosListagemConsulta;
import com.guiBarao.softCare.repository.ConsultaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/consultas")
@RestController
public class ConsultaController {

    @Autowired
    ConsultaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@Valid @RequestBody DadosCadastroConsulta consulta) {
        repository.save(new Consulta (consulta));
    }

    @GetMapping
    public List<DadosListagemConsulta> listar() {
        return repository.findAll().stream().map(DadosListagemConsulta::new).toList();

    }

    @GetMapping("/{id}")
    public String visualizarProntuario(@PathVariable long id) {
        Consulta consulta = repository.getReferenceById(id);

        return consulta.getProntuario();
    }

    @PutMapping
    @Transactional
    public void atualizarInfo(@Valid @RequestBody DadosAtualizacaoConsulta dados) {
        Consulta consulta = repository.getReferenceById(dados.id());
        consulta.atualizarInfo(dados);
    }


}
