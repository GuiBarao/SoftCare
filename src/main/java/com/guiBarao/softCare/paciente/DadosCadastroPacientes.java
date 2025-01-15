package com.guiBarao.softCare.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosCadastroPacientes(

        @NotNull
        String nome,

        @NotNull
        LocalDate dataNascimento,

        @Email
        String email,

        @NotNull
        @Pattern(regexp = "\\d{8,19}")
        String telefone,

        @Pattern(regexp = "\\d{11}")
        String cpf
) {}
