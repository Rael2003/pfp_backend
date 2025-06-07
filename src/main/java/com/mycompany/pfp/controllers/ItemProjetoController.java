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

import com.mycompany.pfp.models.ItemProjeto;
import com.mycompany.pfp.models.ItemProjetoDTO;
import com.mycompany.pfp.models.Projeto;
import com.mycompany.pfp.services.ItemProjetoService;
import com.mycompany.pfp.services.ProjetoService;
import com.mycompany.pfp.services.Usuario;

@RestController
public class ItemProjetoController {
    private final ItemProjetoService serv;
    private final ProjetoService servProj;   

    public ItemProjetoController(ItemProjetoService serv, ProjetoService servProj) {
        this.serv = serv;
        this.servProj = servProj;
    }

    @GetMapping(path = "/item")
    public List<ItemProjeto> Listaprojetos(){
        return serv.ListAll();
    }

    @PostMapping(path = "/item")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody ItemProjetoDTO itemProjeto) {
        if(Usuario.validarUsuario(login, senha)){
            System.out.println("*******************");
            System.out.println(itemProjeto.getProjeto());
            System.out.println("*******************");
            Projeto projeto = servProj.ListOne(itemProjeto.getProjeto());
            
            
            ItemProjeto proj = new ItemProjeto();
            proj.setData_conclusao(itemProjeto.getData_conclusao());
            proj.setData_entrega_prevista(itemProjeto.getData_entrega_prevista());
            proj.setDescricao(itemProjeto.getDescricao());
            proj.setData_inicio(itemProjeto.getData_inicio());
            proj.setProjeto(projeto);
            proj.setStatus(itemProjeto.getStatus());
            proj.setTitulo_item(itemProjeto.getTitulo_item());
            serv.AddItem(proj);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/item")
    public ResponseEntity<String> deleteProj(@RequestParam long idProj){
        serv.DeleteItem(idProj);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/item")
    public ResponseEntity<String> updateProj(@RequestParam long idProj, @RequestBody ItemProjetoDTO json){
        serv.UpdateItem(idProj,json);
        return ResponseEntity.ok("Ok");
    }
}
