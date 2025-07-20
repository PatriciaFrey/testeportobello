package lista.portobello.listaportobello.service;

import lista.portobello.listaportobello.model.Pedido;
import lista.portobello.listaportobello.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido criarPedido(Pedido pedido) {
        double total = pedido.getItens().stream()
                .mapToDouble(item -> item.getPrecoUnitario() * item.getQuantidade())
                .sum();

        pedido.setTotal(total);

        System.out.println("Simulando envio para fila: Pedido criado ID " + pedido.getId());

        return repository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pedido> buscarPorId(String id) {
        return repository.findById(id);
    }

    public void deletarPorId(String id) {
        repository.deleteById(id);
    }
}

