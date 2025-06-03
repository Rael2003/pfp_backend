package com.mycompany.pfp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.pfp.models.Funcionario;
import com.mycompany.pfp.models.FuncionarioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mycompany.pfp.services.Usuario;
import com.mycompany.pfp.services.FuncionarioService;


@RestController
public class FuncionarioController {

    private List<FuncionarioDTO> funcionarios = new ArrayList<FuncionarioDTO>();
    private final FuncionarioService serv;

    public FuncionarioController(FuncionarioService serv) {
        this.serv = serv;
    }
    
    @GetMapping(path = "/funcionarios")
    public List<Funcionario> Listafuncionarios(){
        return serv.ListAll();
    }

    @PostMapping(path = "/funcionarios")
    public ResponseEntity<String> postMethodName(@RequestParam String login,String senha,String funcionario) {
        
        if(Usuario.validarUsuario(login, senha)){
            FuncionarioDTO func =  new FuncionarioDTO();
            func.nomeCompleto = funcionario;
            funcionarios.add(func);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
        
    }
    


}
