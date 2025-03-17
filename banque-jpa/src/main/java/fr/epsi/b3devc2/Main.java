package fr.epsi.b3devc2;

import fr.epsi.b3devc2.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            insertCompteWithClients(em, transaction);
            Client clientWithMultipleComptes = insertClientWithMultipleComptes(em, transaction);
            insertVirementOperation(em, transaction, clientWithMultipleComptes.getComptes().get(0).getId());
            insertGeneralOperation(em, transaction, clientWithMultipleComptes.getComptes().get(1).getId());

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    private static void insertCompteWithClients(EntityManager em, EntityTransaction transaction) {
        transaction.begin();

        // Créer une banque
        Banque banque = new Banque();
        banque.setNom("Ma Banque");
        em.persist(banque);

        // Créer des adresses pour chaque client
        Adresse adresse1 = new Adresse();
        adresse1.setNumero("1");
        adresse1.setRue("Rue de la Paix");
        adresse1.setCodePostal("75000");
        adresse1.setVille("Paris");
        em.persist(adresse1);

        Adresse adresse2 = new Adresse();
        adresse2.setNumero("2");
        adresse2.setRue("Avenue des Champs-Élysées");
        adresse2.setCodePostal("75008");
        adresse2.setVille("Paris");
        em.persist(adresse2);

        // Créer des clients
        Client client1 = new Client();
        client1.setMontant(1000.0);
        client1.setMotif("Client 1");
        client1.setDate(LocalDateTime.now());
        client1.setBanque(banque);
        client1.setAdresse(adresse1);
        adresse1.setClient(client1);

        Client client2 = new Client();
        client2.setMontant(1500.0);
        client2.setMotif("Client 2");
        client2.setDate(LocalDateTime.now());
        client2.setBanque(banque);
        client2.setAdresse(adresse2);
        adresse2.setClient(client2);

        em.persist(client1);
        em.persist(client2);

        // Créer un compte courant
        Courant compteCourant = new Courant();
        compteCourant.setNumero("12345");
        compteCourant.setSolde(2000.0);
        compteCourant.setDecouvert(500.0);
        compteCourant.setClient(client1);

        em.persist(compteCourant);

        transaction.commit();
    }

    private static Client insertClientWithMultipleComptes(EntityManager em, EntityTransaction transaction) {
        transaction.begin();

        // Créer une banque
        Banque banque = new Banque();
        banque.setNom("Autre Banque");
        em.persist(banque);

        // Créer une adresse
        Adresse adresse = new Adresse();
        adresse.setNumero("3");
        adresse.setRue("Boulevard Haussmann");
        adresse.setCodePostal("75009");
        adresse.setVille("Paris");
        em.persist(adresse);

        // Créer un client
        Client client = new Client();
        client.setMontant(2000.0);
        client.setMotif("Client avec plusieurs comptes");
        client.setDate(LocalDateTime.now());
        client.setBanque(banque);
        client.setAdresse(adresse);
        adresse.setClient(client);

        em.persist(client);

        // Créer un compte d'assurance vie
        AssuranceVie assuranceVie = new AssuranceVie();
        assuranceVie.setNumero("67890");
        assuranceVie.setSolde(5000.0);
        assuranceVie.setDateFin(LocalDate.now().plusYears(10));
        assuranceVie.setTaux(2.5);
        assuranceVie.setClient(client);

        em.persist(assuranceVie);

        // Créer un compte Livret A
        LivretA livretA = new LivretA();
        livretA.setNumero("54321");
        livretA.setSolde(3000.0);
        livretA.setTaux(1.0);
        livretA.setClient(client);

        em.persist(livretA);

        // Associer les comptes au client
        client.setComptes(Arrays.asList(assuranceVie, livretA));

        transaction.commit();
        return client;
    }

    private static void insertVirementOperation(EntityManager em, EntityTransaction transaction, int compteId) {
        transaction.begin();

        // Récupérer un compte existant
        Compte compte = em.find(Compte.class, compteId);

        // Créer une opération de virement
        Virement virement = new Virement();
        virement.setMontant(100.0);
        virement.setMotif("Virement vers un autre compte");
        virement.setDate(LocalDateTime.now());
        virement.setBeneficiaire("Beneficiaire Name");
        virement.setCompte(compte);

        em.persist(virement);

        transaction.commit();
    }

    private static void insertGeneralOperation(EntityManager em, EntityTransaction transaction, int compteId) {
        transaction.begin();

        // Récupérer un compte existant
        Compte compte = em.find(Compte.class, compteId);

        // Créer une opération générale
        Operation operation = new Operation();
        operation.setMontant(50.0);
        operation.setMotif("Opération générale");
        operation.setDate(LocalDateTime.now());
        operation.setCompte(compte);

        em.persist(operation);

        transaction.commit();
    }
}
