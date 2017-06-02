package bean;

/**
 * Created by ammach on 7/22/2016.
 */
public class Zone {

    private Long id;
    private String nom;
    private Secteure secteure;

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
}
