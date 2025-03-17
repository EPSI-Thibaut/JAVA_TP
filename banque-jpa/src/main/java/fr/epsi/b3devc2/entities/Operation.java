package fr.epsi.b3devc2.entities;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = 'Operation')


public class Operation {
    @Override
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String montant;
    private String motif;
    private LocalDateTime date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

