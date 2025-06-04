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
    
}
