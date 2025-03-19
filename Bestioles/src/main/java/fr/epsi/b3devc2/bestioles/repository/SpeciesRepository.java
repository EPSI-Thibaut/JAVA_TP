// SpeciesRepository.java
package fr.epsi.b3devc2.bestioles.repository;

import fr.epsi.b3devc2.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    Species findFirstByCommonName(String commonName);

    List<Species> findByLatinNameContainingIgnoreCase(String latinName);
}