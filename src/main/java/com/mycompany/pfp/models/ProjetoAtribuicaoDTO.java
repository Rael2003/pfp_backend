package com.mycompany.pfp.models;

import java.time.LocalDate;

public class ProjetoAtribuicaoDTO {
    private String nomeProjeto;
    private LocalDate dataInicio;
    private LocalDate dataPrevisaoEntrega;
    private String status;
    private Long empresaClienteId;
    private String empresaCliente;
    private Long funcionarioResponsavelId;
    private String funcionarioResponsavel;
    private Integer projetoItemId;
    private String titulo_item;
    private Integer quantidade;

    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
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
    public Long getEmpresaClienteId() {
        return empresaClienteId;
    }
    public void setEmpresaClienteId(Long empresaClienteId) {
        this.empresaClienteId = empresaClienteId;
    }
    public String getEmpresaCliente() {
        return empresaCliente;
    }
    public void setEmpresaCliente(String empresaCliente) {
        this.empresaCliente = empresaCliente;
    }
    public Long getFuncionarioResponsavelId() {
        return funcionarioResponsavelId;
    }
    public void setFuncionarioResponsavelId(Long funcionarioResponsavelId) {
        this.funcionarioResponsavelId = funcionarioResponsavelId;
    }
    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }
    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }
    public Integer getProjetoItemId() {
        return projetoItemId;
    }
    public void setProjetoItemId(Integer projetoItemId) {
        this.projetoItemId = projetoItemId;
    }
    public String getTitulo_item() {
        return titulo_item;
    }
    public void setTitulo_item(String titulo_item) {
        this.titulo_item = titulo_item;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
