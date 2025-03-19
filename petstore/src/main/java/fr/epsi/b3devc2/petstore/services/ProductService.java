package fr.epsi.b3devc2.petstore.services;

import fr.epsi.b3devc2.petstore.bo.ProdType;
import fr.epsi.b3devc2.petstore.bo.Product;
import fr.epsi.b3devc2.petstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByCode(String code) {
        return productRepository.findByCode(code);
    }

    public void insertSampleProducts() {

        // Insérer des produits dans la base de données
        Product product1 = new Product();
        product1.setCode("PROD001");
        product1.setLabel("Product 1");
        product1.setType(ProdType.FOOD);
        product1.setPrice(10.0);
        productRepository.save(product1);

    }
}
