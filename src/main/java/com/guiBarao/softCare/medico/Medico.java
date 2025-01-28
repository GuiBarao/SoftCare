package com.guiBarao.softCare.medico;
import jakarta.persistence.*;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String crm;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private boolean ativo;

    public Medico() {}

    public Medico(DadosCadastroMedicos dados)
    {
        this.nome = dados.nome();
        this.crm = dados.crm();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.ativo = true;
    }

    public void excluir()
    {
        this.ativo = false;
    }

    public void atualizarInfo(DadosAtualizacaoMedicos dados)
    {
        if(dados.email() != null)
        {
            this.email = dados.email();
        }

        if (dados.nome() != null)
        {
            this.nome = dados.nome();
        }

        if(dados.telefone() != null)
        {
            this.telefone = dados.telefone();
        }
    }

    public long getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
