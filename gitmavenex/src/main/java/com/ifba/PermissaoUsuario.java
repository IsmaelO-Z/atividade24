package com.ifba;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PermissaoUsuario extends Pedido{

    private UUID id;          
    private String nome;      
    private String descricao; 
}
