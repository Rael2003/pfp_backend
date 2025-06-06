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

import com.mycompany.pfp.models.Estoque;
import com.mycompany.pfp.services.EstoqueService;
import com.mycompany.pfp.services.Usuario;

@RestController
public class EstoqueController {
    private final EstoqueService serv;

    public EstoqueController(EstoqueService serv) {
        this.serv = serv;
    }
    
    @GetMapping(path = "/estoque")
    public List<Estoque> ListaEstoque(){
        return serv.ListAll();
    }

    @PostMapping(path = "/estoque")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody Estoque estoque) {
        if(Usuario.validarUsuario(login, senha)){
            serv.AddEst(estoque);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/estoque")
    public ResponseEntity<String> deleteEst(@RequestParam long id){
        serv.DeleteEst(id);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/estoque")
    public ResponseEntity<String> updateEst(@RequestParam long id, @RequestBody Estoque json){
        serv.UpdateEst(id,json);
        return ResponseEntity.ok("Ok");
    }
}
