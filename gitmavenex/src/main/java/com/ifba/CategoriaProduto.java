package com.ifba;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaProduto{
    private UUID id;
    private String nome;
    private String descricao;
    private List<Produto> produtos; 
}