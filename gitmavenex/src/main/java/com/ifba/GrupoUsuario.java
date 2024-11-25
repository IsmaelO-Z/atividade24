package com.ifba;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GrupoUsuario {

    private UUID id;       
    private String nome;  
    private List<PermissaoUsuario> permissoes;
}