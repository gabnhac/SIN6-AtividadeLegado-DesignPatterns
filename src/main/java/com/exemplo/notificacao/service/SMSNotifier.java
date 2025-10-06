package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.interfaces.INotifierComponent;

public class SMSNotifier extends BaseNotifier{

    public SMSNotifier(INotifierComponent componenteNotificacao){
        super(componenteNotificacao);
    }

    @Override
    public void sendNotification(String message, Pedido pedido) {
        super.sendNotification(message, pedido);
        SMSNotification(message, pedido);
    }

    public void SMSNotification(String message, Pedido pedido){
        System.out.println("Enviando notificação SMS para %s. Mensagem: %s".formatted(pedido.getCliente(), message));
    }
}
