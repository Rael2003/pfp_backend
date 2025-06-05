package com.mycompany.pfp.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.pfp.models.Cliente;
import com.mycompany.pfp.services.ClienteService;
import com.mycompany.pfp.services.Usuario;

@RestController
public class ClienteController {
    private final ClienteService serv;

    public ClienteController(ClienteService serv) {
        this.serv = serv;
    }
    
    @GetMapping(path = "/clientes")
    public List<Cliente> Listaclientes(){
        return serv.ListAll();
    }

    @PostMapping(path = "/clientes")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody Cliente cliente) {
        if(Usuario.validarUsuario(login, senha)){
            serv.AddCli(cliente);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/clientes")
    public ResponseEntity<String> deleteCli(@RequestParam long idCli){
        serv.DeleteCli(idCli);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/clientes")
    public ResponseEntity<String> updateCli(@RequestParam long idCli, @RequestBody Cliente json){
        serv.UpdateCli(idCli,json);
        return ResponseEntity.ok("Ok");
    }
}
