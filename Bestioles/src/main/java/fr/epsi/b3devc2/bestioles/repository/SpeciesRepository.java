package fr.epsi.b3devc2.bestioles.repository;

import fr.epsi.b3devc2.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    @Query("SELECT s FROM Species s ORDER BY s.commonName ASC")
    List<Species> findAllOrderedByCommonName();

    @Query("SELECT s FROM Species s WHERE s.commonName LIKE %:commonName%")
    List<Species> findByCommonNameLike(@Param("commonName") String commonName);
}