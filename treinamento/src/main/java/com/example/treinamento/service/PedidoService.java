package com.example.treinamento.service;

import com.example.treinamento.dto.PedidoDTO;
import com.example.treinamento.entity.Pedido;
import com.example.treinamento.entity.StatusPedido;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);

void atualizaStatus(Integer id, StatusPedido statusPedido);}
