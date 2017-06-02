package bean;

import java.math.BigDecimal;

/**
 * Created by ammach on 7/22/2016.
 */
public class Locale38Item {

    private Long id;
    private BigDecimal surface;
    private int nombreElement;

    private CategorieTauxTaxe38 categorieTauxTaxe38;

    private Locale locale;
    private int anneeDernierPaiement; // jamais paye ==> -1 deja pay ==> >0  n apppartien pas a cette cat ==> -2
    private int trimestreDernierPaiement;
}
