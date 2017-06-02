package bean;

import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Quartier {

    private Long id;
    private String nom;

    private Secteure secteure;

    private List<Rue> rues;

    public Quartier(String nom, Secteure secteure) {
        this.nom = nom;
        this.secteure = secteure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Secteure getSecteure() {
        return secteure;
    }

    public void setSecteure(Secteure secteure) {
        this.secteure = secteure;
    }

    public List<Rue> getRues() {
        return rues;
    }

    public void setRues(List<Rue> rues) {
        this.rues = rues;
    }
}
