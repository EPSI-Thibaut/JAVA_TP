package fr.epsi.b3devc2.petstore;

import fr.epsi.b3devc2.petstore.bo.Animal;
import fr.epsi.b3devc2.petstore.bo.Product;
import fr.epsi.b3devc2.petstore.services.AnimalService;
import fr.epsi.b3devc2.petstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    @Autowired
    private AnimalService animalService;

    public static void main(String[] args) {
        SpringApplication.run(PetstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        // Insérer des enregistrements dans la base de données
        productService.insertSampleProducts();
        animalService.insertSampleAnimals();

        // Requête pour récupérer les produits par code
        List<Product> products = productService.getProductsByCode("PROD001");
        products.forEach(product -> System.out.println("Product: " + product.getLabel()));

        // Requête pour récupérer les animaux par ID de PetStore
        Long petStoreId = 1L;
        List<Animal> animals = animalService.getAnimalsByPetStoreId(petStoreId);
        animals.forEach(animal -> System.out.println("Animal Color: " + animal.getCouleur()));
    }
}
