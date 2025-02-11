package com.guiBarao.softCare.medicamentos;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroMedicamento(

        @NotNull
        String nome,

        @NotNull
        float preco,

        @NotNull
        String descricao

) {}
