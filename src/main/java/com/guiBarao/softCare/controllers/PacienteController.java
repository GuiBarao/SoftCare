package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.paciente.DadosAtualizacaoPacientes;
import com.guiBarao.softCare.paciente.DadosCadastroPacientes;
import com.guiBarao.softCare.paciente.Paciente;
import com.guiBarao.softCare.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private PacienteRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroPacientes dados) {
        repository.save(new Paciente (dados));
    }

    public void atualizarInfo(@Valid @RequestBody DadosAtualizacaoPacientes dados) {
        Paciente paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInfo(dados);
    }

}
