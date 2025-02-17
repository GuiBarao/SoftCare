package com.guiBarao.softCare.reposicaoestoque;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoEstoque(

        @NotNull
        Long id,

        StatusReposicao status


) {}
