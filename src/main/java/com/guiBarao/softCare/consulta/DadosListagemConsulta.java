package com.guiBarao.softCare.consulta;

import com.guiBarao.softCare.medico.Medico;

import java.time.LocalDate;
import java.time.LocalTime;

public record DadosListagemConsulta(

        long id,
        long idMedico,
        long idPaciente,
        LocalDate data,
        LocalTime horario,
        StatusConsulta status
)
{

    public DadosListagemConsulta (Consulta dados)
    {
        this(dados.getId(), dados.getIdMedico(), dados.getIdPaciente(), dados.getData(), dados.getHorario(), dados.getStatus());
    }

}
