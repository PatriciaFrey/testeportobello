package lista.portobello.listaportobello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;
}
