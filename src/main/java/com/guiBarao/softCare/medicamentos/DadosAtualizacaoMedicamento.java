package com.guiBarao.softCare.medicamentos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicamento(

        @NotNull
        long id,

        Float preco,

        Long quantEstoque,

        Long maximoEstoque,

        String descricao

) {}
