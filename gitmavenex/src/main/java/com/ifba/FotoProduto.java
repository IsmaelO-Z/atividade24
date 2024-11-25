package com.ifba;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FotoProduto {

    private UUID id;
    private String titulo;
    private String descricao;
    private String url;
}