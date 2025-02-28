package fr.epsi.b3devc2.dao;

import fr.epsi.b3devc2.bo.Livre;
import jakarta.persistence.EntityManager;

public class LivreDAO {

    // Rechercher un livre par son ID
    public static Livre findLivreById(EntityManager em, Integer id) {
        return em.find(Livre.class, id);
    }
}