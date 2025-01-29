package com.guiBarao.softCare.internacao;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "internacao")
@Table(name = "internacoes")
public class Internacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idPaciente;
    private LocalDate dataInicio;
    private LocalDate dataAlta;
    private String prontuario;


    public Internacao() {}


    public Internacao(DadosCadastroInternacao dados)
    {
        this.idPaciente = dados.idPaciente();
        this.dataInicio = dados.dataInicio();
    }

    public void atualizarInfo(DadosAtualizacaoInternacao dados)
    {
        if(dados.dataAlta() != null)
        {
            this.dataAlta = dados.dataAlta();
        }

        if(dados.prontuario() != null)
        {
            this.prontuario = dados.prontuario();
        }
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
