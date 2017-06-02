package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Taxe38Anuelle {

    private Long id;
    private int annee;
    //private BigDecimal montantRetard;
    private BigDecimal montantTotalTrimistriel; // somme (montant trim)
    private BigDecimal montantTotalRetardTrimistriel; // somme (montantRetard trim)

    private Date datePresentation;

    private List<Taxe38Trimistrielle> taxe38Trimistrielles;

    private User user;

    private Date dateSystem = new Date();
    private boolean colturer;

    private Locale locale;
    private Long numeroBordure;
    private int nombreTotaleMoisRetard;

    private Redevable redevable;
    private BigDecimal valeurLocation;
    private BigDecimal surface;

    public Taxe38Anuelle() {
    }

    public Taxe38Anuelle(Long id,int annee, Locale locale, Redevable redevable, BigDecimal valeurLocation) {
        this.id=id;
        this.annee = annee;
        this.locale = locale;
        this.redevable = redevable;
        this.valeurLocation = valeurLocation;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Taxe38Anuelle{" +
                "id=" + id +
                ", annee=" + annee +
                ", montantTotalTrimistriel=" + montantTotalTrimistriel +
                ", montantTotalRetardTrimistriel=" + montantTotalRetardTrimistriel +
                ", datePresentation=" + datePresentation +
                ", taxe38Trimistrielles=" + taxe38Trimistrielles +
                ", user=" + user +
                ", dateSystem=" + dateSystem +
                ", colturer=" + colturer +
                ", locale=" + locale +
                ", numeroBordure=" + numeroBordure +
                ", nombreTotaleMoisRetard=" + nombreTotaleMoisRetard +
                ", redevable=" + redevable +
                ", valeurLocation=" + valeurLocation +
                ", surface=" + surface +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public BigDecimal getMontantTotalTrimistriel() {
        return montantTotalTrimistriel;
    }

    public void setMontantTotalTrimistriel(BigDecimal montantTotalTrimistriel) {
        this.montantTotalTrimistriel = montantTotalTrimistriel;
    }

    public BigDecimal getMontantTotalRetardTrimistriel() {
        return montantTotalRetardTrimistriel;
    }

    public void setMontantTotalRetardTrimistriel(BigDecimal montantTotalRetardTrimistriel) {
        this.montantTotalRetardTrimistriel = montantTotalRetardTrimistriel;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public List<Taxe38Trimistrielle> getTaxe38Trimistrielles() {
        return taxe38Trimistrielles;
    }

    public void setTaxe38Trimistrielles(List<Taxe38Trimistrielle> taxe38Trimistrielles) {
        this.taxe38Trimistrielles = taxe38Trimistrielles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateSystem() {
        return dateSystem;
    }

    public void setDateSystem(Date dateSystem) {
        this.dateSystem = dateSystem;
    }

    public boolean isColturer() {
        return colturer;
    }

    public void setColturer(boolean colturer) {
        this.colturer = colturer;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Long getNumeroBordure() {
        return numeroBordure;
    }

    public void setNumeroBordure(Long numeroBordure) {
        this.numeroBordure = numeroBordure;
    }

    public int getNombreTotaleMoisRetard() {
        return nombreTotaleMoisRetard;
    }

    public void setNombreTotaleMoisRetard(int nombreTotaleMoisRetard) {
        this.nombreTotaleMoisRetard = nombreTotaleMoisRetard;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public BigDecimal getValeurLocation() {
        return valeurLocation;
    }

    public void setValeurLocation(BigDecimal valeurLocation) {
        this.valeurLocation = valeurLocation;
    }

    public BigDecimal getSurface() {
        return surface;
    }

    public void setSurface(BigDecimal surface) {
        this.surface = surface;
    }
}
