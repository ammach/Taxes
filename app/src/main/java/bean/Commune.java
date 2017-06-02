package bean;

import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Commune {

    private Long id;
    private String nom;
    private String logo;

    private Ville ville;

    private List<Secteure> secteures;

    private List<User> users;

    private List<Activite> activites;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Commune(Ville ville) {
        this.ville = ville;
    }
}
