package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final NotifierService notificacaoService;

    public PedidoService(NotifierService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(String cliente, double valor, String message) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        
    }
}
