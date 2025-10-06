package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.interfaces.INotifierComponent;

public class BaseNotifier implements INotifierComponent{
    private INotifierComponent notifierComponent;
    
    public BaseNotifier(INotifierComponent componenteNotificacao){
        this.notifierComponent = componenteNotificacao;
    }
    
    @Override
    public void sendNotification(String message, Pedido pedido) {
        notifierComponent.sendNotification(message, pedido);
    }
}
