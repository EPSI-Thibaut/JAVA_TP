package fr.epsi.b3devc2.dao;

import fr.epsi.b3devc2.bo.Client;
import jakarta.persistence.EntityManager;

public class ClientDAO {

    // CRUD operations

    // Création d'un nouveau client
    public void createClient(EntityManager em, Client client) {
        em.persist(client);
    }

    // Retrouver un client par id
    public Client findClientById(EntityManager em, Integer id) {
        return em.find(Client.class, id);
    }

    // Mettre à jour les données du client
    public void updateClient(EntityManager em, Client client) {
        em.merge(client);
    }

    // Supprimer un client par son id
    public void deleteClient(EntityManager em, Integer id) {
        Client client = em.find(Client.class, id);
        if (client != null) {
            em.remove(client);
        }
    }
}
