package fr.epsi.b3devc2.entities;

import jakarta.persistence.Entity;

@Entity
@Id
public class Virement extends Operation {
    private String beneficiaire;

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
