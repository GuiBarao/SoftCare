package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.medico.DadosAtualizacaoMedicos;
import com.guiBarao.softCare.medico.DadosCadastroMedicos;
import com.guiBarao.softCare.medico.DadosListagemMedico;
import com.guiBarao.softCare.medico.Medico;
import com.guiBarao.softCare.repository.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroMedicos dados)
    {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> listar() {
        return repository.findAllByAtivoTrue().stream().map(DadosListagemMedico::new).toList();
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable long id)
    {
        Medico medico = repository.getReferenceById(id);
        medico.excluir();
    }

    @Transactional
    @PutMapping
    public void atualizarInfo(@Valid @RequestBody DadosAtualizacaoMedicos dados)
    {
        Medico medico = repository.getReferenceById(dados.id());
        medico.atualizarInfo(dados);
    }

}
