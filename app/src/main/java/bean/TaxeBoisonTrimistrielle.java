package bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ammach on 7/22/2016.
 */
public class TaxeBoisonTrimistrielle {

    private Long id;
    private int numeroTrimistre;
    private BigDecimal chiffreAffaire;
    private BigDecimal montant; // pourcentage :::tauxTaxeBoisonApplicable* chiffreAffaire
    private BigDecimal montantRetard; // TarificationRetardTaxeBoison: premier*chiffreAffaire + deuxiem*chiffreAffaire+autres*chiffreAffaire*(nbrMois -2)

    private Date datePresentation;

    private TaxeBoisonAnuelle taxeBoisonAnulle;

    private User user;

    private Date dateSystem = new Date();
    private boolean colturer;
    private BigDecimal montantPremierMoisRetard;
    private BigDecimal pourcentage;
    private BigDecimal pourcentageRetardPremierMois;
    private BigDecimal pourcentageRetardAutreMois;
    private BigDecimal montantAutresMoisRetard;
    private Long numeroBordure;
    private int nombreMoisRetard;

    private Redevable redevable;

    public TaxeBoisonTrimistrielle(int numeroTrimistre, BigDecimal chiffreAffaire, BigDecimal montant, BigDecimal montantRetard) {
        this.numeroTrimistre = numeroTrimistre;
        this.chiffreAffaire = chiffreAffaire;
        this.montant = montant;
        this.montantRetard = montantRetard;
    }

    public int getNumeroTrimistre() {
        return numeroTrimistre;
    }

    public void setNumeroTrimistre(int numeroTrimistre) {
        this.numeroTrimistre = numeroTrimistre;
    }

    public BigDecimal getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(BigDecimal chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(BigDecimal montantRetard) {
        this.montantRetard = montantRetard;
    }
}
