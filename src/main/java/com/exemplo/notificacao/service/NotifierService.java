package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.interfaces.INotifierComponent;

import org.springframework.stereotype.Service;

@Service
public class NotifierService implements INotifierComponent{

    @Override
    public void sendNotification(String message, Pedido pedido) {
        System.out.println("Enviando notificação por email para %s. Mensagem: %s".formatted(pedido.getCliente(), message));
    }
}
