package fr.epsi.b3devc2.petstore.repository;

import fr.epsi.b3devc2.petstore.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Ici on gère la méthode pour trouver un produit par son code
    List<Product> findByCode(String code);
}
