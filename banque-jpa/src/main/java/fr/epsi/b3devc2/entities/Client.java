package fr.epsi.b3devc2.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double montant;
    private String motif;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "banque_id")
    private Banque banque;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Compte> comptes;

    // Getters et Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public Banque getBanque() { return banque; }
    public void setBanque(Banque banque) { this.banque = banque; }

    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse adresse) { this.adresse = adresse; }

    public List<Compte> getComptes() { return comptes; }
    public void setComptes(List<Compte> comptes) { this.comptes = comptes; }
}
