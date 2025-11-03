package com.mycompany.pfp.controllers;

import java.util.ArrayList;
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
import com.mycompany.pfp.models.ItemProjeto;
import com.mycompany.pfp.models.PedidoEstoque;
import com.mycompany.pfp.models.PedidoEstoqueDTO;
import com.mycompany.pfp.models.PedidoEstoqueProjetoDTO;
import com.mycompany.pfp.services.EstoqueService;
import com.mycompany.pfp.services.ItemProjetoService;
import com.mycompany.pfp.services.PedidoEstoqueService;
import com.mycompany.pfp.services.Usuario;

@RestController
public class PedidoEstoqueController {

    private final PedidoEstoqueService serv;
    private final EstoqueService servEstoque;
    private final ItemProjetoService servItem;
    
    public PedidoEstoqueController(PedidoEstoqueService serv, EstoqueService servEstoque, ItemProjetoService servItem) {
        this.serv = serv;
        this.servEstoque = servEstoque;
        this.servItem = servItem;
    }

    @GetMapping(path = "/pedidoEstoque")
    public List<PedidoEstoqueProjetoDTO> Listaprojetos(){

        List<PedidoEstoque> ped = serv.ListAll();
        List<PedidoEstoqueProjetoDTO> ret = new ArrayList<>();

        for (PedidoEstoque pedidoEstoque : ped) {
            PedidoEstoqueProjetoDTO dado = new PedidoEstoqueProjetoDTO();
            dado.setId(pedidoEstoque.getId());
            dado.setDataPedido(pedidoEstoque.getDataPedido());
            dado.setItemProjetoId(pedidoEstoque.getItemProjetoId().getId());
            dado.setProdutoEstoqueId(pedidoEstoque.getProdutoEstoqueId().getId());
            dado.setQuantidadeAtendida(pedidoEstoque.getQuantidadeAtendida());
            dado.setQuantidadeSolicitada(pedidoEstoque.getQuantidadeSolicitada());
            dado.setStatus(pedidoEstoque.getStatus());
            dado.setItemProjeto(pedidoEstoque.getItemProjetoId().getTitulo_item());
            dado.setProjetoId(pedidoEstoque.getItemProjetoId().getProjeto().getId());
            dado.setProjeto(pedidoEstoque.getItemProjetoId().getProjeto().getNomeProjeto());

            ret.add(dado);
        }

        return ret;
    }

    @GetMapping(path = "/pedidoEstoqueProj")
    public List<PedidoEstoqueProjetoDTO> ListaprojetosPorId(@RequestParam Long id){
        List<PedidoEstoqueProjetoDTO> fin = new ArrayList<>();
        ItemProjeto item = servItem.ListOne(id);
        List<PedidoEstoque> ped = serv.ListProj(item);
        
        for (PedidoEstoque pedidoEstoque : ped) {
            PedidoEstoqueProjetoDTO dado = new PedidoEstoqueProjetoDTO();
            dado.setDataPedido(pedidoEstoque.getDataPedido());
            dado.setItemProjetoId(pedidoEstoque.getItemProjetoId().getId());
            dado.setProdutoEstoqueId(pedidoEstoque.getProdutoEstoqueId().getId());
            dado.setQuantidadeAtendida(pedidoEstoque.getQuantidadeAtendida());
            dado.setQuantidadeSolicitada(pedidoEstoque.getQuantidadeSolicitada());
            dado.setStatus(pedidoEstoque.getStatus());
            dado.setItemProjeto(pedidoEstoque.getItemProjetoId().getTitulo_item());

            fin.add(dado);
        }

        return fin;

    }

    @PostMapping(path = "/pedidoEstoque")
    public ResponseEntity<String> postMethodName(@RequestParam String login, @RequestParam String senha, @RequestBody PedidoEstoqueDTO pedido) {
        if(Usuario.validarUsuario(login, senha)){
            Estoque estoque = servEstoque.ListOne(pedido.getProdutoEstoqueId());
            ItemProjeto item = servItem.ListOne(pedido.getItemProjetoId());
            
            PedidoEstoque ped = new PedidoEstoque();
            ped.setDataPedido(pedido.getDataPedido());
            ped.setItemProjetoId(item);
            ped.setProdutoEstoqueId(estoque);
            ped.setQuantidadeAtendida(pedido.getQuantidadeAtendida());
            ped.setQuantidadeSolicitada(pedido.getQuantidadeSolicitada());
            ped.setStatus(pedido.getStatus());
            serv.AddItem(ped);
            return ResponseEntity.ok("Ok");
        }else{
            return ResponseEntity.badRequest().body("Login e/ou senha Inválidos!");
        }
    }

    @DeleteMapping(path = "/pedidoEstoque")
    public ResponseEntity<String> deleteProj(@RequestParam long id){
        serv.DeleteItem(id);
        return ResponseEntity.ok("Ok");
    }

    @PutMapping(path = "/pedidoEstoque")
    public ResponseEntity<String> updateProj(@RequestParam long id, @RequestBody PedidoEstoqueDTO json){
        serv.UpdateItem(id,json);
        return ResponseEntity.ok("Ok");
    }
}
