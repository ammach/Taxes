package bean;

import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Rue {

    private Long id;
    private String nom;
    private boolean type;//0:rue 1:avenue

    private Quartier quartier;

    private List<Locale> locales ;

    public Rue(String nom, Quartier quartier) {
        this.nom = nom;
        this.quartier = quartier;
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

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public List<Locale> getLocales() {
        return locales;
    }

    public void setLocales(List<Locale> locales) {
        this.locales = locales;
    }
}
