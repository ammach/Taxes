package bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ammach on 7/22/2016.
 */
public class Taxe38TrimistrielleItem {

    private Long id;
    private BigDecimal montant;
    private BigDecimal montantPremierMoisRetard;
    private BigDecimal montantAutreMoisRetard;
    private BigDecimal montantRetard;
    private BigDecimal pourcentage;
    private BigDecimal pourcentageRetardPremierMois;
    private BigDecimal pourcentageRetardAutreMois;
    private BigDecimal surfaceMin;
    private BigDecimal montantMin;
    private int nombreElementLocale38Item;// ch7al mn element kan f lwa9t li tkheless had taxe

    private Date datePresentation;
    private int nombreMoisRetard;

    private Taxe38Trimistrielle taxe38Trimistrielle;

    private Locale38Item locale38Item;

    private Redevable redevable;

    private User user;

    private Date dateSystem = new Date();
}
