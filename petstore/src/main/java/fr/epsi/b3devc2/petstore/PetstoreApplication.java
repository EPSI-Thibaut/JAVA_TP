package fr.epsi.b3devc2.petstore;

import fr.epsi.b3devc2.petstore.bo.Product;
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

    public static void main(String[] args) {
        SpringApplication.run(PetstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Insérer des enregistrements dans la base de données
        productService.insertSampleProducts();

        // Requête pour récupérer les produits par code
        List<Product> products = productService.getProductsByCode("PROD001");
        products.forEach(product -> System.out.println(product.getLabel()));
    }
}
