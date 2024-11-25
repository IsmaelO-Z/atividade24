package com.ifba;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ItemPedido {
    
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Produto produto;
    private Pedido pedido;
}
