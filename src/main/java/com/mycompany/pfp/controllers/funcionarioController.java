package com.mycompany.pfp.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.pfp.models.Funcionario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import com.mycompany.pfp.services.Usuario;
import com.mycompany.pfp.services.FuncionarioService;


@RestController
public class FuncionarioController {

    private final FuncionarioService serv;

    public FuncionarioController(FuncionarioService serv) {
        this.serv = serv;
    }
    
    @GetMapping(path = "/funcionarios")
    public List<Funcionario> Listafuncionarios(){
        return serv.ListAll();
    }

    @PostMapping(path = "/funcionarios")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody Funcionario funcionario) {
        if(Usuario.validarUsuario(login, senha)){
            serv.AddFunc(funcionario);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/funcionarios")
    public ResponseEntity<String> deleteFunc(@RequestParam long idFunc){
        serv.DeleteFunc(idFunc);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/funcionarios")
    public ResponseEntity<String> updateFunc(@RequestParam long idFunc, @RequestBody Funcionario json){
        serv.UpdateFunc(idFunc,json);
        return ResponseEntity.ok("Ok");
    }
}
