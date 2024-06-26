package com.minitreinamento.treinamento.controller;

import com.minitreinamento.treinamento.dto.PessoaCriacaoDto;
import com.minitreinamento.treinamento.dto.PessoaListagemDto;
import com.minitreinamento.treinamento.dto.PessoaMapper;
import com.minitreinamento.treinamento.entity.Pessoa;
import com.minitreinamento.treinamento.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;
    @GetMapping

    public ResponseEntity<List<PessoaListagemDto>> lista() {
        List<Pessoa> pessoa = pessoaService.listarPessoas();
        if (pessoa.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        List<PessoaListagemDto> pessoasDto = PessoaMapper.toListDto(pessoa);
        return ResponseEntity.ok(pessoasDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaListagemDto> buscaPessoaPorId(@PathVariable Long id) {
        Pessoa pessoa = pessoaService.buscarPessoaPorId(id);

        PessoaListagemDto dto = PessoaMapper.toDto(pessoa);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<PessoaListagemDto> criar(@RequestBody PessoaCriacaoDto pessoa){
        Pessoa estEntity = PessoaMapper.toEntity(pessoa);
        Pessoa estSalvo = pessoaService.criar(estEntity);
        PessoaListagemDto dto = PessoaMapper.toDto(estSalvo);

        URI uri =URI.create("/estabelecimentos/" +estSalvo.getId());

        return ResponseEntity.created(uri).body(dto);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id,
                                                  @RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.atualizarPessoa(id, pessoa));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
        return ResponseEntity.noContent().build();
    }
}
