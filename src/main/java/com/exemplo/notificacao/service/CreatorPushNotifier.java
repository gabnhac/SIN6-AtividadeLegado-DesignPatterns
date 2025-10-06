package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.interfaces.INotifierComponent;

public class CreatorPushNotifier extends CreatorNotifier{
    @Override
    public INotifierComponent createNotificationService() {
        INotifierComponent baseNotifier = new NotifierService();
        return new PushNotifier(baseNotifier);
    }

}
