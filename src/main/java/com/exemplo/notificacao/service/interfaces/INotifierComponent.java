package com.exemplo.notificacao.service.interfaces;

import com.exemplo.notificacao.model.Pedido;

public interface INotifierComponent {
    public void sendNotification(String message, Pedido pedido);
}
