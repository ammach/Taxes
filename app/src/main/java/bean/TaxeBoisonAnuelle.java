package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class TaxeBoisonAnuelle {

    private Long id;
    private int annee;
    private BigDecimal montantRetard;
    private BigDecimal montantTotalTrimistriel; // somme (montant trim)
    private BigDecimal montantTotalRetardTrimistriel; // somme (montantRetard trim)
    private BigDecimal chiffreAffaire; // somme chiffre affaire trim

    private Date datePresentation;

    private List<TaxeBoisonTrimistrielle> taxeBoisonTrimistrielles;

    private Locale locale;

    private User user;

    private Date dateSystem = new Date();
    private boolean colturer;

    private Redevable redevable;
    private int numeroBordure;
    private int nombreMoisRetard;
}
