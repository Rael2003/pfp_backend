package com.mycompany.pfp.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_projeto", nullable = false)
    private String nomeProjeto;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_previsao_entrega")
    private LocalDate dataPrevisaoEntrega;

    @Column(name = "status")
    private String status;

    @Column(name = "prioridade")
    private String prioridade;

    @ManyToOne
    @JoinColumn(name = "empresa_cliente_id", nullable = false)
    private Cliente empresaClienteId;

    @ManyToOne
    @JoinColumn(name = "funcionario_responsavel_id", nullable = false)
    private Funcionario funcionarioResponsavelId;

    public Integer getId() {
        return id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataPrevisaoEntrega() {
        return dataPrevisaoEntrega;
    }

    public void setDataPrevisaoEntrega(LocalDate dataPrevisaoEntrega) {
        this.dataPrevisaoEntrega = dataPrevisaoEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Cliente getEmpresaClienteId() {
        return empresaClienteId;
    }

    public void setEmpresaClienteId(Cliente empresaClienteId) {
        this.empresaClienteId = empresaClienteId;
    }

    public Funcionario getFuncionarioResponsavelId() {
        return funcionarioResponsavelId;
    }

    public void setFuncionarioResponsavelId(Funcionario funcionarioResponsavelId) {
        this.funcionarioResponsavelId = funcionarioResponsavelId;
    }

    
}