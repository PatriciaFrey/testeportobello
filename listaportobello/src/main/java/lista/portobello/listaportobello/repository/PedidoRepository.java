package lista.portobello.listaportobello.repository;

import lista.portobello.listaportobello.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
