package com.ifba;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cidade{

    private UUID id;    
    private String nome; 
    private Estado estado;
}
