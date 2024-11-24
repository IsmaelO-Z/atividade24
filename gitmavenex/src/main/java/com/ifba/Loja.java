package com.ifba;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Loja extends Pedido{

    private UUID id;
    private String nome;
    private LocalDateTime dataCadastro;
    private LocalTime horarioAberto;
    private LocalTime horarioFechado;
    private Boolean aberto;
    private Boolean ativo;
    private Boolean aceitaRetirada;
    private BigDecimal taxaDelivery;
    private Integer tempoMinimoEntrega;
    private Integer tempoMaximoEntrega;
    private Map<String, String> contatos;  
    private Map<String, String> redes;     
    private String urlFotoBanner;        
}
