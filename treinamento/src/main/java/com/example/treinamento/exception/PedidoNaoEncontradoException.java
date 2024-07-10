package com.example.treinamento.exception;

public class PedidoNaoEncontradoException extends RuntimeException {
    public PedidoNaoEncontradoException (){
        super("Pedido não encontrado");
    }
}
