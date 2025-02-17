package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.medicamentos.DadosAtualizacaoMedicamento;
import com.guiBarao.softCare.medicamentos.DadosCadastroMedicamento;
import com.guiBarao.softCare.medicamentos.DadosListagemMedicamentos;
import com.guiBarao.softCare.medicamentos.Medicamento;
import com.guiBarao.softCare.reposicaoestoque.DadosCadastroReposicaoEstoque;
import com.guiBarao.softCare.repository.MedicamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoRepository repository;

    @GetMapping
    public Page<DadosListagemMedicamentos> listar(@PageableDefault (size = 10, sort = {"nome"}) Pageable pageable)
    {
        return repository.findAllByAtivoTrue(pageable).map(DadosListagemMedicamentos :: new);
    }

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedicamento dados)
    {
        repository.save(new Medicamento(dados));
    }


    private void solicitarReposicao(Medicamento medicamento)
    {
        String url = "http://localhost:8080/medicamentos/reposicoes";

        DadosCadastroReposicaoEstoque novaReposicao = new DadosCadastroReposicaoEstoque(medicamento.getId());

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.postForObject(url, novaReposicao, String.class);
    }

    private void controleEstoque(Medicamento medicamento)
    {

        double minimoEstoque = medicamento.getEstoqueMaximo() * 0.20;

        if (medicamento.getQuantEstoque() < minimoEstoque)
        {
            solicitarReposicao(medicamento);
        }
    }

    @Transactional
    @PutMapping
    public void atualizarInfo(@RequestBody DadosAtualizacaoMedicamento dados)
    {
        Medicamento medicamento = repository.getReferenceById(dados.id());
        medicamento.atualizarInfo(dados);

        controleEstoque(medicamento);

    }

    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable long id)
    {
        Medicamento medicamento = repository.getReferenceById(id);

        medicamento.excluir();
    }

}
