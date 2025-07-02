package com.mycompany.pfp.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioDTO {
    private Long id;
    
    public Long getId() {
        return id;
    }

    private String nome_completo;
    private LocalDate data_de_nascimento;
    private String cpf;
    private String rg;
    private String endereco_completo;
    private String telefone_celular;
    private String email;
    private String estado_civil;
    private String cargo_funcao;
    private LocalDate data_de_admissao;
    private BigDecimal salario;
    private String regime_de_contratacao;
    private String numero_do_pis;
    private String banco;
    private String agencia;
    private String conta_bancaria;
    private LocalDate exame_admissional;

    // Construtor a partir da entidade Funcionario
    public FuncionarioDTO(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.nome_completo = funcionario.getNome_completo();
        this.data_de_nascimento = funcionario.getData_de_nascimento();
        this.cpf = funcionario.getCpf();
        this.rg = funcionario.getRg();
        this.endereco_completo = funcionario.getEndereco_completo();
        this.telefone_celular = funcionario.getTelefone_celular();
        this.email = funcionario.getEmail();
        this.estado_civil = funcionario.getEstado_civil();
        this.cargo_funcao = funcionario.getCargo_funcao();
        this.data_de_admissao = funcionario.getData_de_admissao();
        this.salario = funcionario.getSalario();
        this.regime_de_contratacao = funcionario.getRegime_de_contratacao();
        this.numero_do_pis = funcionario.getNumero_do_pis();
        this.banco = funcionario.getBanco();
        this.agencia = funcionario.getAgencia();
        this.conta_bancaria = funcionario.getConta_bancaria();
        this.exame_admissional = funcionario.getExame_admissional();
    }

    public LocalDate getExame_admissional() {
        return exame_admissional;
    }
    public void setExame_admissional(LocalDate exame_admissional) {
        this.exame_admissional = exame_admissional;
    }
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }
    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEndereco_completo() {
        return endereco_completo;
    }
    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }
    public String getTelefone_celular() {
        return telefone_celular;
    }
    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstado_civil() {
        return estado_civil;
    }
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    public String getCargo_funcao() {
        return cargo_funcao;
    }
    public void setCargo_funcao(String cargo_funcao) {
        this.cargo_funcao = cargo_funcao;
    }
    public LocalDate getData_de_admissao() {
        return data_de_admissao;
    }
    public void setData_de_admissao(LocalDate data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public String getRegime_de_contratacao() {
        return regime_de_contratacao;
    }
    public void setRegime_de_contratacao(String regime_de_contratacao) {
        this.regime_de_contratacao = regime_de_contratacao;
    }
    public String getNumero_do_pis() {
        return numero_do_pis;
    }
    public void setNumero_do_pis(String numero_do_pis) {
        this.numero_do_pis = numero_do_pis;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta_bancaria() {
        return conta_bancaria;
    }
    public void setConta_bancaria(String conta_bancaria) {
        this.conta_bancaria = conta_bancaria;
    }

    
    
}
