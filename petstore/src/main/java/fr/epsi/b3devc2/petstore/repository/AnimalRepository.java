package fr.epsi.b3devc2.petstore.repository;

import fr.epsi.b3devc2.petstore.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    // Requête  pour trouver les animaux par l'ID du pet store
    @Query("SELECT a FROM Animal a WHERE a.petStore.id = :petStoreId")
    List<Animal> findByPetStoreId(@Param("petStoreId") Long petStoreId);
}
