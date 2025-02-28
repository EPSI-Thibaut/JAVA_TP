package fr.epsi.b3devc2.dao;

import fr.epsi.b3devc2.bo.Emprunt;
import jakarta.persistence.EntityManager;
import java.util.List;

public class EmpruntDAO {

    public Emprunt findEmpruntById(EntityManager em, Integer id) {
        return em.find(Emprunt.class, id);
    }

    public List<Emprunt> findEmpruntsByClient(EntityManager em, Integer clientId) {
        return em.createQuery("SELECT e FROM Emprunt e WHERE e.client.id = :clientId", Emprunt.class)
                .setParameter("clientId", clientId)
                .getResultList();
    }

    public void createEmprunt(EntityManager em, Emprunt emprunt) {
        em.persist(emprunt);
    }
}
