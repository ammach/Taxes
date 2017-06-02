package bean;

/**
 * Created by ammach on 7/22/2016.
 */
public class CategorieHabitation {

    private Locale locale;

    private Long id;
    private String designation ;

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
