package fr.epsi.b32425c2.demo_boot.service;

import org.springframework.stereotype.Component;

// 3 - Création d'une classe SmsService avec composant spring
@Component // Composant
public class SmsService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par SMS.";
    }
}
