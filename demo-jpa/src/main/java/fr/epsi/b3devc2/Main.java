package fr.epsi.b3devc2;

import fr.epsi.b3devc2.bo.Client;
import fr.epsi.b3devc2.bo.Emprunt;
import fr.epsi.b3devc2.bo.Livre;
import fr.epsi.b3devc2.dao.ClientDAO;
import fr.epsi.b3devc2.dao.EmpruntDAO;
import fr.epsi.b3devc2.dao.LivreDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        LivreDAO livreDAO = new LivreDAO();
        ClientDAO clientDAO = new ClientDAO();
        EmpruntDAO empruntDAO = new EmpruntDAO();

        try {
            // Tester la création d'un livre
            em.getTransaction().begin();
            Livre newLivre = new Livre();
            newLivre.setTitre("La vie est bouge");
            newLivre.setAuteur("Thibaut");
            livreDAO.createLivre(em, newLivre);
            em.getTransaction().commit();
            System.out.println("Livre créé avec ID: " + newLivre.getId());

            // Tester la lecture d'un livre
            Livre livre = livreDAO.findLivreById(em, newLivre.getId());
            if (livre != null) {
                System.out.println("Livre trouvé :");
                System.out.println("ID : " + livre.getId());
                System.out.println("Titre : " + livre.getTitre());
                System.out.println("Auteur : " + livre.getAuteur());
            } else {
                System.out.println("Aucun livre trouvé pour ce ID.");
            }

            // Tester la mise à jour d'un livre
            em.getTransaction().begin();
            if (livre != null) {
                livre.setTitre("Cours de JAVA EPSI");
                livreDAO.updateLivre(em, livre);
            }
            em.getTransaction().commit();
            System.out.println("Livre mis à jour.");

            // Tester la suppression d'un livre
            Integer idToDelete = 3;
            em.getTransaction().begin();
            livreDAO.deleteLivre(em, idToDelete);
            em.getTransaction().commit();
            System.out.println("Livre avec ID " + idToDelete + " supprimé.");

            // extraire un emprunt en fonction son id
            Integer empruntId = 1;
            Emprunt emprunt = empruntDAO.findEmpruntById(em, empruntId);
            if (emprunt != null) {
                System.out.println("Emprunt trouvé : " + emprunt.getId());
                System.out.println("Livres associés :");
                for (Livre l : emprunt.getLivres()) {
                    System.out.println("- " + l.getTitre());
                }
            } else {
                System.out.println("Aucun emprunt trouvé pour l'ID " + empruntId);
            }

            // Affichez tous les livres associés
            Integer clientId = 1;
            List<Emprunt> empruntsClient = empruntDAO.findEmpruntsByClient(em, clientId);
            System.out.println("Emprunts du client " + clientId + " : " + empruntsClient.size());
            for (Emprunt e : empruntsClient) {
                System.out.println("Emprunt ID: " + e.getId() + ", Date début: " + e.getDateDebut());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}