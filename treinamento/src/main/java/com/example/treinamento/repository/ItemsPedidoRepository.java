package com.example.treinamento.repository;

import com.example.treinamento.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedidoRepository extends JpaRepository <ItemPedido, Integer> {
}
