package bean;

import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Ville {

    private Long id;
    private String nom;
    private List<Commune> communes;

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

    public List<Commune> getCommunes() {
        return communes;
    }

    public void setCommunes(List<Commune> communes) {
        this.communes = communes;
    }

    public Ville(String nom) {
        this.nom = nom;
    }
}
