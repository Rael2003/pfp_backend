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
    
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String rg;
    private String enderecoCompleto;
    private String telefoneCelular;
    private String email;
    private String estadoCivil;
    private String cargoFuncao;
    private LocalDate dataDeAdmissao;
    private BigDecimal salario;
    private String regimeDeContratacao;
    private String numeroDoPis;
    private String banco;
    private String agencia;
    private String contaBancaria;
    private LocalDate exameAdmissional;
}
