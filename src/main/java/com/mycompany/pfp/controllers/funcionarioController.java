package com.mycompany.pfp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mycompany.pfp.models.funcionarioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mycompany.pfp.services.usuario;


@RestController
public class funcionarioController {

    private List<funcionarioDTO> funcionarios = new ArrayList<funcionarioDTO>();
    private ObjectMapper objectMapper;
    
    public funcionarioController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping(path = "/funcionarios")
    public ResponseEntity<String> funcionarios() throws JsonProcessingException{
        return ResponseEntity.ok(objectMapper.writeValueAsString(funcionarios));
    }

    @PostMapping(path = "/funcionarios")
    public ResponseEntity<String> postMethodName(@RequestParam String login,String senha,String funcionario) {
        
        if(usuario.validarUsuario(login, senha)){
            funcionarioDTO func =  new funcionarioDTO();
            func.nomeCompleto = funcionario;
            funcionarios.add(func);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
        
    }
    


}
