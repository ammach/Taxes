package bean;

import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Secteure {

    private Long id;
    private String nom;

    private Commune commune;

    private List<Quartier> quartiers;

    public Secteure(String nom, Commune commune) {
        this.nom = nom;
        this.commune = commune;
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

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    public List<Quartier> getQuartiers() {
        return quartiers;
    }

    public void setQuartiers(List<Quartier> quartiers) {
        this.quartiers = quartiers;
    }
}
