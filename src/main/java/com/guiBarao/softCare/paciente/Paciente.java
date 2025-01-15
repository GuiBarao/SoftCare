package com.guiBarao.softCare.paciente;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "pacientes")
@Entity(name = "paciente")
public class Paciente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private boolean ativo;
    private String cpf;

    public Paciente() {}

    public Paciente(DadosCadastroPacientes dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.ativo = true;
    }

    public void excluir()
    {
        this.ativo = false;
    }

    public void atualizarInfo(DadosAtualizacaoPacientes dados)
    {
        if(dados.nome() != null)
        {
            this.nome = dados.nome();
        }

        if(dados.email() != null)
        {
            this.email = dados.email();
        }

        if(dados.telefone() != null)
        {
            this.telefone = dados.telefone();
        }
    }


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getCpf() {
        return cpf;
    }
}
