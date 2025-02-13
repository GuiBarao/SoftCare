package com.guiBarao.softCare.receita;


public record DadosListagemReceitas(

        Long id,
        Long idPaciente,
        Long idMedico,
        boolean ativo
) {
    public DadosListagemReceitas (Receita dados) {
        this(dados.getId(), dados.getIdPaciente(), dados.getIdMedico(), dados.isAtivo());
    }
}
