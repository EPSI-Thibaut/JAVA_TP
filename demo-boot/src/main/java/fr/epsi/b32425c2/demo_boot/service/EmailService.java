package fr.epsi.b32425c2.demo_boot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Création d'une classe EmailService
@Primary // Indique que c'est le service par defaut

// solution de mettre en environnement dev ou prod dans application.properties le composant
// @Profile("dev")
//@Profile("prod")

public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par email.";
    }
}
