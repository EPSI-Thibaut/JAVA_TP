package fr.epsi.b3devc2.petstore.services;

import fr.epsi.b3devc2.petstore.bo.Animal;
import fr.epsi.b3devc2.petstore.bo.Fish;
import fr.epsi.b3devc2.petstore.bo.FishLivEnv;
import fr.epsi.b3devc2.petstore.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void insertSampleAnimals() {

        // Insérer des animaux dans la base de données
        Animal fish1 = new Fish();
        fish1.setBirth(new Date());
        fish1.setCouleur("Red");
        ((Fish) fish1).setLivingEnv(FishLivEnv.FRESH_WATER);
        animalRepository.save(fish1);
    }

    public List<Animal> getAnimalsByPetStoreId(Long petStoreId) {
        return animalRepository.findByPetStoreId(petStoreId);
    }
}
