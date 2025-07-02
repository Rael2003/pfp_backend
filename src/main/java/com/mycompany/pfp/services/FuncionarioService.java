package com.mycompany.pfp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.pfp.repositories.FuncionarioRepository;

import com.mycompany.pfp.models.Funcionario;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> ListAll() {
        return funcionarioRepository.findAll();
    }

    public void AddFunc(Funcionario func){
        funcionarioRepository.save(func);
    }

    public Funcionario ListOne(long id){
        return funcionarioRepository.getReferenceById(id);
    }
    
    public void DeleteFunc(long idFunc){
        Funcionario func = ListOne(idFunc);
        if(func.getId() != null){
            funcionarioRepository.delete(func);
        }
        
    }
    
    public void UpdateFunc(long idFunc, Funcionario nFunc){
        Funcionario afunc = ListOne(idFunc);
        afunc.setAgencia(nFunc.getAgencia());
        afunc.setBanco(nFunc.getBanco());
        afunc.setCargo_funcao(nFunc.getCargo_funcao());
        afunc.setConta_bancaria(nFunc.getConta_bancaria());
        afunc.setCpf(nFunc.getCpf());
        afunc.setData_de_admissao(nFunc.getData_de_admissao());
        afunc.setData_de_nascimento(nFunc.getData_de_nascimento());
        afunc.setEmail(nFunc.getEmail());
        afunc.setEndereco_completo(nFunc.getEndereco_completo());
        afunc.setEstado_civil(nFunc.getEstado_civil());
        afunc.setNome_completo(nFunc.getNome_completo());
        afunc.setNumero_do_pis(nFunc.getNumero_do_pis());
        afunc.setRegime_de_contratacao(nFunc.getRegime_de_contratacao());
        afunc.setRg(nFunc.getRg());
        afunc.setSalario(nFunc.getSalario());
        afunc.setTelefone_celular(nFunc.getTelefone_celular());

        funcionarioRepository.save(afunc);
    }
}
