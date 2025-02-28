package fr.epsi.b3devc2.dao;

import fr.epsi.b3devc2.bo.Livre;
import jakarta.persistence.EntityManager;

public class LivreDAO {

    // CRUD de la table livre

    // Rechercher un livre par son ID -> R
    public Livre findLivreById(EntityManager em, Integer id) {
        return em.find(Livre.class, id);
    }

    // Créer un nouveau livre -> C
    public void createLivre(EntityManager em, Livre livre) {
        em.persist(livre);
    }

    // Mettre à jour un livre -> U
    public void updateLivre(EntityManager em, Livre livre) {
        em.merge(livre);
    }

    // Supprimer un livre par ID -> D
    public void deleteLivre(EntityManager em, Integer id) {
        Livre livre = em.find(Livre.class, id);
        if (livre != null) {
            em.remove(livre);
        }
    }
}
