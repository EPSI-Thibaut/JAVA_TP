// AnimalRepository.java
package fr.epsi.b3devc2.bestioles.repository;

import fr.epsi.b3devc2.bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT COUNT(a) FROM Animal a WHERE a.sex = :gender")
    long countByGender(@Param("gender") String gender);

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Person p JOIN p.animals a WHERE a = :animal")
    boolean existsByAnimal(@Param("animal") Animal animal);
}