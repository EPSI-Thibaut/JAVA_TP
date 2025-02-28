package fr.epsi.b3devc2;

import fr.epsi.b3devc2.bo.Livre;
import fr.epsi.b3devc2.dao.LivreDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            // Rechercher le livre par son ID
            Livre livre = LivreDAO.findLivreById(em, 8);

            if (livre != null) {
                System.out.println("Livre trouvé :");
                System.out.println("ID : " + livre.getId());
                System.out.println("Titre : " + livre.getTitre());
                System.out.println("Auteur : " + livre.getAuteur());
            } else {
                System.out.println("Aucun livre trouvé pour ce ID.");
            }
        } finally {
            em.close();
            emf.close();
        }
    }
}