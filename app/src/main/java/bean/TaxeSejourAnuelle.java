package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class TaxeSejourAnuelle {

    private Long id;
    private int annee;
    private BigDecimal nombreNuit;
    private BigDecimal nombreClient;
    private BigDecimal montantRetard;
    private BigDecimal montantTotalTrimistriel; // somme (montant trim)
    private BigDecimal montantTotalRetardTrimistriel; // somme (montantRetard trim)

    private Date datePresentation;

    private List<TaxeSejourTrimistrielle> taxeSejourTrimistrielles;

    private User user;

    private Date dateSystem = new Date();
    private boolean colturer;

    private Locale locale;
    private int numeroBordure;
    private int nombreMoisRetard;

    private Redevable redevable;
}
