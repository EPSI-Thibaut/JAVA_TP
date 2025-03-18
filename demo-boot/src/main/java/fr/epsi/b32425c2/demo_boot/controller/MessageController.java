package fr.epsi.b32425c2.demo_boot.controller;

import fr.epsi.b32425c2.demo_boot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Création d'une classe MessageController
public class MessageController {

    private MessageService messageService;

    @Autowired // Injection de dépendance
    public  MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {

    }
}
