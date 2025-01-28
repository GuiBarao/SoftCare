package com.guiBarao.softCare.medico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedicos(
        @NotNull
        String nome,

        @Pattern(regexp = "\\d{6,15}")
        @NotNull
        String crm,

        @NotNull
        @Pattern(regexp = "\\d{8,19}")
        String telefone,

        @Email
        String email,

        @NotNull
        @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotNull
        Double preco_consulta
) {}
