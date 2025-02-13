package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.receita.DadosCadastroReceitas;
import com.guiBarao.softCare.receita.DadosListagemReceitas;
import com.guiBarao.softCare.receita.Receita;
import com.guiBarao.softCare.repository.ReceitaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class ReceitaController {

    @Autowired
    private ReceitaRepository repository;

    @Transactional
    @PostMapping("/{idPaciente}/receitas")
    public void cadastrar(@RequestBody DadosCadastroReceitas dados, @PathVariable Long idPaciente)
    {
        DadosCadastroReceitas receitaComIdPaciente = new DadosCadastroReceitas(
                idPaciente,
                dados.idMedico()
        );

        repository.save(new Receita(receitaComIdPaciente));
    }


    @GetMapping("/{idPaciente}/receitas")
    public List<DadosListagemReceitas> listar(@PathVariable Long idPaciente)
    {
       return repository.findByIdPaciente(idPaciente).stream().map(DadosListagemReceitas::new).toList();
    }

    @Transactional
    @DeleteMapping("/{idPaciente}/receitas/{idReceita}")
    public void excluir(@PathVariable Long idPaciente, @PathVariable Long idReceita)
    {
        Receita receita = repository.getReferenceById(idReceita);
        receita.excluir();
    }
}
