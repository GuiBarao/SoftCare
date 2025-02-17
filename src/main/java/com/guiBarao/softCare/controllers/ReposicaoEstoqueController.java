package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.reposicaoestoque.*;
import com.guiBarao.softCare.repository.ReposicaoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicamentos/reposicoes")
public class ReposicaoEstoqueController {

    @Autowired
    ReposicaoRepository repository;

    @GetMapping
    public Page<DadosListagemReposicaoEstoque> listar(@PageableDefault(size = 10) Pageable page)
    {
        return repository.findAll(page).map(DadosListagemReposicaoEstoque :: new);
    }

    @GetMapping("/pendentes")
    public Page<DadosListagemReposicaoEstoque> listarPendentes(@PageableDefault(size = 10) Pageable page)
    {
        return repository.findAllByStatus(StatusReposicao.PENDENTE, page).map(DadosListagemReposicaoEstoque :: new);
    }

    @GetMapping("/aprovados")
    public Page<DadosListagemReposicaoEstoque> listarAprovados(@PageableDefault(size = 10) Pageable page)
    {
        return repository.findAllByStatus(StatusReposicao.APROVADO, page).map(DadosListagemReposicaoEstoque :: new);
    }

    @GetMapping("/rejeitados")
    public Page<DadosListagemReposicaoEstoque> listarRejeitados(@PageableDefault(size = 10) Pageable page)
    {
        return repository.findAllByStatus(StatusReposicao.REJEITADO, page).map(DadosListagemReposicaoEstoque :: new);
    }

    @GetMapping("/finalizados")
    public Page<DadosListagemReposicaoEstoque> listarFinalizados(@PageableDefault(size = 10) Pageable page)
    {
        return repository.findAllByStatus(StatusReposicao.FINALIZADO, page).map(DadosListagemReposicaoEstoque :: new);
    }

    @Transactional
    @PostMapping
    public void cadastrar(@Valid @RequestBody DadosCadastroReposicaoEstoque dados)
    {
        ReposicaoEstoque reposicao = new ReposicaoEstoque(dados);

        repository.save(reposicao);

    }

    @Transactional
    @PutMapping
    public void atualizarStatus(@Valid @RequestBody DadosAtualizacaoEstoque dados)
    {
        ReposicaoEstoque reposicao = repository.getReferenceById(dados.id());

        reposicao.setStatus(dados.status());
    }

}
