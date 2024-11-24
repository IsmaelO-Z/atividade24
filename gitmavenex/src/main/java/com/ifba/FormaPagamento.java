package com.ifba;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FormaPagamento extends Pedido{
    private UUID id;
    private String nome;
    private String bandeira;
}