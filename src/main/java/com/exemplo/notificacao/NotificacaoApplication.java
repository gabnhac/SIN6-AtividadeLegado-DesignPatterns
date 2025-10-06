package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exemplo.notificacao.service.interfaces.INotifierComponent;
import com.exemplo.notificacao.service.CreatorNotifier;
import com.exemplo.notificacao.service.CreatorPushNotifier;
import com.exemplo.notificacao.service.CreatorSMSNotifier;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String SUCESS_MESSAGE = "Pedido criado com sucesso!";

        System.out.println("=== Sistema de Notificação de Pedidos ===");

        Pedido pedido1 = new Pedido("João", 150.0);
        Pedido pedido2 = new Pedido("Maria", 320.0);
        Pedido pedido3 = new Pedido("Carlos", 80.0);

        INotifierComponent pedido1Notifier = CreatorNotifier.factoryNotificationService(new CreatorPushNotifier());
        pedido1Notifier.sendNotification(SUCESS_MESSAGE, pedido1);

        INotifierComponent pedido2Notifier = CreatorNotifier.factoryNotificationService(new CreatorSMSNotifier());
        pedido2Notifier.sendNotification(SUCESS_MESSAGE, pedido2);

        INotifierComponent pedido3Notifier = CreatorNotifier.factoryNotificationService();
        pedido3Notifier.sendNotification(SUCESS_MESSAGE, pedido3);

        System.out.println("=== Fim da execução ===");
    }
}
