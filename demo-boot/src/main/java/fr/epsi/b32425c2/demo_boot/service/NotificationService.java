package fr.epsi.b32425c2.demo_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String notifyUser(String notificationDeTest) {
        return messageService.getMessage();
    }
}
