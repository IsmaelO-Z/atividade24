package com.ifba;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario extends Pedido {

    private UUID id;
    private String nomeCompleto;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private Map<String, String> contatos;  
    private String urlFoto;              
}