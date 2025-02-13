package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.paciente.DadosAtualizacaoPacientes;
import com.guiBarao.softCare.paciente.DadosCadastroPacientes;
import com.guiBarao.softCare.paciente.DadosListagemPaciente;
import com.guiBarao.softCare.paciente.Paciente;
import com.guiBarao.softCare.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroPacientes dados) {
        repository.save(new Paciente (dados));
    }


    @Transactional
    @PutMapping
    public void atualizarInfo(@Valid @RequestBody DadosAtualizacaoPacientes dados) {
        Paciente paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInfo(dados);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable long id) {
        Paciente paciente = repository.getReferenceById(id);
        paciente.excluir();
    }


    @GetMapping
    public List<DadosListagemPaciente> listar() {
        return repository.findAllByAtivoTrue().stream().map(DadosListagemPaciente::new).toList();
    }

}
