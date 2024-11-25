package com.ifba;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    private UUID id;
    private String nome;
    private String codigoBarras;
    private String descricao;
    private BigDecimal valor;
    private Boolean ativo;
    private Loja loja;
    private List<String> tags;
    private List<CategoriaProduto> categorias;
    private List<FotoProduto> fotos;
}
