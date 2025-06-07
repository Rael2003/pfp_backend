package com.mycompany.pfp.models;

import java.time.LocalDate;

public class ProjetoDTO{
    private Integer id;
    private String nomeProjeto;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataPrevisaoEntrega;
    private String status;
    private String prioridade;
    private Long empresaClienteId;
    private Long funcionarioResponsavelId;

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

    public Long getEmpresaClienteId() {
        return empresaClienteId;
    }

    public void setEmpresaClienteId(Long empresaClienteId) {
        this.empresaClienteId = empresaClienteId;
    }

    public Long getFuncionarioResponsavelId() {
        return funcionarioResponsavelId;
    }

    public void setFuncionarioResponsavelId(Long funcionarioResponsavelId) {
        this.funcionarioResponsavelId = funcionarioResponsavelId;
    }

    
}