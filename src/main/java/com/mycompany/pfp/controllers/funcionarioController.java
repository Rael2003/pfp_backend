package com.mycompany.pfp.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.pfp.models.Funcionario;
import com.mycompany.pfp.models.FuncionarioDTO;
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

    @GetMapping(path = "/funcionarioid")
    public FuncionarioDTO ListaPorId(@RequestParam Long id){
        System.out.println("***********************");
        System.out.println(id);
        System.out.println("***********************");

        Funcionario f = serv.ListOne(id);
        return new FuncionarioDTO(f);
    }

    @PostMapping(path = "/funcionarios")
    public ResponseEntity<String> postMethodName(@RequestBody Funcionario funcionario) {
        //@RequestParam String login, @RequestParam String senha, 
        //if(Usuario.validarUsuario(login, senha)){
            serv.AddFunc(funcionario);
            return ResponseEntity.ok("Ok");
        //}else{
        //    return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        //}
    }

    @DeleteMapping(path = "/funcionarios")
    public ResponseEntity<String> deleteFunc(@RequestParam long id){
        serv.DeleteFunc(id);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/funcionarios")
    public ResponseEntity<String> updateFunc(@RequestParam long id, @RequestBody Funcionario json){
        serv.UpdateFunc(id,json);
        return ResponseEntity.ok("Ok");
    }
}
