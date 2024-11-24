package com.ifba;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ItemPedido extends Pedido {
    
    private Integer quantidade;
    private BigDecimal valorTotal;
    private String observacao;
}
