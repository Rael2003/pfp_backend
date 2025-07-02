package com.mycompany.pfp.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }

    @Column(name = "nome_completo", nullable = false)
    private String nome_completo;
    @Column(name = "data_de_nascimento")
    private LocalDate data_de_nascimento;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "endereco_completo")
    private String endereco_completo;
    @Column(name = "telefone_celular")
    private String telefone_celular;
    @Column(name = "email")
    private String email;
    @Column(name = "estado_civil")
    private String estado_civil;
    @Column(name = "cargo_funcao")
    private String cargo_funcao;
    @Column(name = "data_de_admissao")
    private LocalDate data_de_admissao;
    @Column(name = "salario")
    private BigDecimal salario;
    @Column(name = "regime_de_contratacao")
    private String regime_de_contratacao;
    @Column(name = "numero_do_pis")
    private String numero_do_pis;
    @Column(name = "banco")
    private String banco;
    @Column(name = "agencia")
    private String agencia;
    @Column(name = "conta_bancaria")
    private String conta_bancaria;
    @Column(name = "exame_admissional")
    private LocalDate exame_admissional;

    

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
