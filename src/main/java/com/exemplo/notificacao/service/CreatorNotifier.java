package com.exemplo.notificacao.service;

import com.exemplo.notificacao.service.interfaces.INotifierComponent;

public abstract class CreatorNotifier {

    public static INotifierComponent factoryNotificationService(CreatorNotifier creatorNotificationService){
        return creatorNotificationService.createNotificationService();
    }

    public static INotifierComponent factoryNotificationService(){
        return new NotifierService();
    }

    public abstract INotifierComponent createNotificationService();
}
