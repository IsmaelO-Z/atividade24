package com.ifba;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FotoProduto extends Pedido {

    private UUID id;
    private String titulo;
    private String descricao;
    private String url;
}