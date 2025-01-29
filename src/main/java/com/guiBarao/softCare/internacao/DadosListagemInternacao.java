package com.guiBarao.softCare.internacao;


import java.time.LocalDate;

public record DadosListagemInternacao(

        LocalDate dataInicio,
        LocalDate dataAlta,
        String prontuario
) {

    public DadosListagemInternacao (Internacao dados) {

        this(dados.getDataInicio(), dados.getDataAlta(), dados.getProntuario());
    }

}
