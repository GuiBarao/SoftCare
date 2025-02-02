package com.guiBarao.softCare.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record DadosCadastroPacientes(

        @NotNull
        String nome,

        @NotNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataNascimento,

        @Email
        String email,

        @NotNull
        @Pattern(regexp = "\\d{8,19}")
        String telefone,

        @Pattern(regexp = "\\d{11}")
        String cpf
) {}
