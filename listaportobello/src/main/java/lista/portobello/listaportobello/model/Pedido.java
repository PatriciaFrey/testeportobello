package lista.portobello.listaportobello.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "pedidos")
public class Pedido {
    @Id
    private String id;
    private String cliente;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private List<ItemPedido> itens;
    private double total;
}
