package com.guiBarao.softCare.reposicaoestoque;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroReposicaoEstoque(

        @NotNull
        Long idMedicamento
) {}
