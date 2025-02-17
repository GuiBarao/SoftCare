package com.guiBarao.softCare.reposicaoestoque;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosListagemReposicaoEstoque(

        Long id,
        Long idMedicamento,
        StatusReposicao status,
        LocalDate dataPedido

) {

    public DadosListagemReposicaoEstoque(ReposicaoEstoque dados)
    {
        this(dados.getId(), dados.getIdMedicamento(), dados.getStatus(), dados.getDataPedido());
    }
}
