package lista.portobello.listaportobello.controller;

import lista.portobello.listaportobello.model.Pedido;
import lista.portobello.listaportobello.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Pedido> criar(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(service.criarPedido(pedido));
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscar(@PathVariable String id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
@DeleteMapping("/{id}")
public ResponseEntity<Void> deletarPedido(@PathVariable String id) {
    service.deletarPorId(id); 
    return ResponseEntity.noContent().build();
}
    
    
}
