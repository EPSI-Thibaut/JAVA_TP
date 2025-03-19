package fr.epsi.b3devc2.bestioles.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void deletePersonsWithoutAnimals() {
        List<Integer> personIds = entityManager.createQuery(
                        "SELECT p.id FROM Person p WHERE p.animals IS EMPTY", Integer.class)
                .getResultList();

        if (!personIds.isEmpty()) {
            entityManager.createQuery("DELETE FROM Person p WHERE p.id IN :ids")
                    .setParameter("ids", personIds)
                    .executeUpdate();
        }
    }
}