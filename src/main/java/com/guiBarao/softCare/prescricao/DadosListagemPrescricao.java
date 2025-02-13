package com.guiBarao.softCare.prescricao;

import java.time.LocalDate;

public record DadosListagemPrescricao(

        Long id,
        Long idReceita,
        Long idMedicamento,
        String descricao,
        LocalDate data
) {
    public DadosListagemPrescricao (Prescricao dados) {
        this(dados.getId(), dados.getIdReceita(), dados.getIdMedicamento(),
                dados.getDescricao(), dados.getData());
    }
}
