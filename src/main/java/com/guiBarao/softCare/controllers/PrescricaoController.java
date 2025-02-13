package com.guiBarao.softCare.controllers;

import com.guiBarao.softCare.prescricao.DadosCadastroPrescricao;
import com.guiBarao.softCare.prescricao.DadosListagemPrescricao;
import com.guiBarao.softCare.prescricao.Prescricao;
import com.guiBarao.softCare.repository.PrescricaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pacientes/{idPaciente}/receitas")
public class PrescricaoController {

    @Autowired
    private PrescricaoRepository repository;

    @Transactional
    @PostMapping("/{idReceita}/prescricoes")
    public void cadastrar(@PathVariable Long idReceita,
                          @RequestBody DadosCadastroPrescricao prescricao)
    {
        DadosCadastroPrescricao dados = new DadosCadastroPrescricao(idReceita, prescricao.idMedicamento(),
                                                                    prescricao.descricao());

        repository.save(new Prescricao(dados));
    }

    @Transactional
    @DeleteMapping("/{idReceita}/prescricoes/{idPrescricao}")
    public void excluir(@PathVariable Long idPrescricao)
    {
        Prescricao prescricao = repository.getReferenceById(idPrescricao);
        prescricao.excluir();
    }

    @GetMapping("/{idReceita}/prescricoes")
    public List<DadosListagemPrescricao> listar(@PathVariable Long idReceita)
    {
        return repository.findByIdReceita(idReceita).stream().map(DadosListagemPrescricao :: new).toList();
    }


}
