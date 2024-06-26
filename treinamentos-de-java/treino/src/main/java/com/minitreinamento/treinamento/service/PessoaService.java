package com.minitreinamento.treinamento.service;

import com.minitreinamento.treinamento.entity.Pessoa;
import com.minitreinamento.treinamento.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public List <Pessoa> listarPessoas(){
        return  pessoaRepository.findAll();
    }
    public Pessoa criar(Pessoa pessoa){
        if(pessoaRepository.existsByEmail(pessoa.getEmail())){
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return pessoaRepository.save(pessoa);
    }
    public Pessoa buscarPessoaPorId(Long id){
        return pessoaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pessoa com id " + id + " não encontrada"));
    }
    public Pessoa atualizarPessoa(Long id, Pessoa pessoaAtualizada){
        if (!pessoaRepository.existsById(id)){
            throw new EntityNotFoundException("Pessoa com id " + pessoaAtualizada.getId() + " não encontrada");

        }
        pessoaAtualizada.setId(id);
        return pessoaRepository.save(pessoaAtualizada);
    }

    public void deletarPessoa(Long id) {
        if (!pessoaRepository.existsById(id)){
            throw new EntityNotFoundException("Pessoa com id " + id + " não encontrada");
        }
        pessoaRepository.deleteById(id);
    }
}
