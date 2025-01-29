package com.guiBarao.softCare.consulta;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Table(name = "consultas")
@Entity(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idPaciente;

    private long idMedico;

    private LocalDate data;
    private LocalTime horario;
    private String prontuario;

    @Enumerated(EnumType.STRING)
    private StatusConsulta status;

    public Consulta() {}

    public Consulta(DadosCadastroConsulta dados) {

        this.idPaciente = dados.idPaciente();
        this.idMedico = dados.idMedico();
        this.data = dados.data();
        this.horario = dados.horario();
        this.status = StatusConsulta.MARCADA;
    }

    public void atualizarInfo(DadosAtualizacaoConsulta dados)
    {
        if(dados.data() != null)
        {
            this.data = dados.data();
        }

        if(dados.horario() != null)
        {
            this.horario = dados.horario();
        }

        if(dados.prontuario() != null) {
            this.prontuario = dados.prontuario();
        }

        if(dados.status() != null)
        {
            this.status = dados.status();
        }
    }

    public long getId() {
        return id;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
