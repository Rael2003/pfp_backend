package com.mycompany.pfp.services;

import java.util.List;
import java.util.Optional;

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

    public Funcionario ListOne(long idFunc){
        return funcionarioRepository.getById(idFunc);
    }
    public void DeleteFunc(long idFunc){
        Funcionario func = ListOne(idFunc);
        if(func.getId() != null){
            funcionarioRepository.delete(func);
        }
        
    }
    
}
