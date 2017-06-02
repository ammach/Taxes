package bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ammach on 7/22/2016.
 */
public class TaxeSejourTrimistrielle {

    private Long id;
    private int numeroTrimistre;
    private BigDecimal nombreNuit;
    private BigDecimal nombreClient;
    private BigDecimal montant; // pourcentage :::tauxTaxeBoisonApplicable* chiffreAffaire
    private BigDecimal montantRetard; // TarificationRetardTaxeBoison: premier*chiffreAffaire + deuxiem*chiffreAffaire+autres*chiffreAffaire*(nbrMois -2)

    private Date datePresentation;

    private TaxeSejourAnuelle taxeSejourAnuelle;

    private User user;

    private Date dateSystem = new Date();
    private boolean colturer;
    private BigDecimal montantPremierMoisRetard;
    private BigDecimal montantAutresMoisRetard;
    private BigDecimal pourcentage;
    private BigDecimal pourcentageRetardPremierMois;
    private BigDecimal pourcentageRetardAutreMois;
    private Long numeroBordure;
    private int nombreMoisRetard;

    private Redevable redevable;
}
