package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.interfaces.INotifierComponent;

public class PushNotifier extends BaseNotifier{

    public PushNotifier(INotifierComponent componenteNotificacao){
        super(componenteNotificacao);
    }

    @Override
    public void sendNotification(String message, Pedido pedido) {
        super.sendNotification(message, pedido);
        pushNotification(message, pedido);
    }

    public void pushNotification(String message, Pedido pedido){
        System.out.println("Enviando notificação push para %s. Mensagem: %s".formatted(pedido.getCliente(), message));
    }
}
