package lista.portobello.listaportobello.model;

import lombok.Data;

@Data
public class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;
}
