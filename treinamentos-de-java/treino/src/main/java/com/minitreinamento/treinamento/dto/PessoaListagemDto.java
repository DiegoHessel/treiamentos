package com.minitreinamento.treinamento.dto;

import lombok.Data;

@Data
public class PessoaListagemDto {
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
