package fr.epsi.b3devc2.petstore.bo;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    @ManyToMany(mappedBy = "petStores")
    private List<Product> products;

    // Constructeur qui reprend les champs de la table PetStore
    public PetStore(Long id, String name, String managerName, Address address, List<Animal> animals, List<Product> products) {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
        this.address = address;
        this.animals = animals;
        this.products = products;
    }

    public PetStore() {
    }

    // Getter et Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
