package fr.epsi.b32425c2.demo_boot.service;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par SMS.";
    }
}
