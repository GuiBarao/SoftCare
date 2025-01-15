package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.paciente.DadosCadastroPacientes;
import com.guiBarao.softCare.paciente.Paciente;
import com.guiBarao.softCare.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

public class PacienteController {

    private PacienteRepository repository;

    public void cadastrar(@Valid @RequestBody DadosCadastroPacientes dados) {
        repository.save(new Paciente (dados));
    }

}
