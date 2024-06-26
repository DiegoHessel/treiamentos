package com.minitreinamento.treinamento.dto;

import com.minitreinamento.treinamento.entity.Pessoa;

import java.util.List;

public class PessoaMapper {

    public static PessoaListagemDto toDto(Pessoa entity) {
        if (entity == null) {
            return null;
        }
        PessoaListagemDto dto = new PessoaListagemDto();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setEmail(entity.getEmail());
        dto.setSenha(entity.getSenha());
        return dto;
    }

    public static List<PessoaListagemDto> toListDto(List<Pessoa> entities) {
        return entities.stream().map(PessoaMapper::toDto).toList();
    }

    public static Pessoa toEntity(PessoaCriacaoDto dto) {
        if (dto == null) {
            return null;
        }
        Pessoa entity = new Pessoa();
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setSenha(dto.getSenha());
        return entity;
    }
}
