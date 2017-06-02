package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Taxe38Trimistrielle {

    private Long id;
    private BigDecimal montantTotalTrimistrielleItem;

    private BigDecimal montantRetardTotalTrimistrielleItem;
    private int numeroTrimistre;

    private Taxe38Anuelle taxe38Anuelle;

    private Redevable redevable;
    private boolean colturer;
    private Long numeroBordure;

    private List<Taxe38TrimistrielleItem> taxe38TrimistrielleItems;

    private User user;

    private Date dateSystem = new Date();


    public Taxe38Trimistrielle(BigDecimal montantTotalTrimistrielleItem, BigDecimal montantRetardTotalTrimistrielleItem, int numeroTrimistre) {
        this.montantTotalTrimistrielleItem = montantTotalTrimistrielleItem;
        this.montantRetardTotalTrimistrielleItem = montantRetardTotalTrimistrielleItem;
        this.numeroTrimistre = numeroTrimistre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMontantTotalTrimistrielleItem() {
        return montantTotalTrimistrielleItem;
    }

    public void setMontantTotalTrimistrielleItem(BigDecimal montantTotalTrimistrielleItem) {
        this.montantTotalTrimistrielleItem = montantTotalTrimistrielleItem;
    }

    public BigDecimal getMontantRetardTotalTrimistrielleItem() {
        return montantRetardTotalTrimistrielleItem;
    }

    public void setMontantRetardTotalTrimistrielleItem(BigDecimal montantRetardTotalTrimistrielleItem) {
        this.montantRetardTotalTrimistrielleItem = montantRetardTotalTrimistrielleItem;
    }

    public int getNumeroTrimistre() {
        return numeroTrimistre;
    }

    public void setNumeroTrimistre(int numeroTrimistre) {
        this.numeroTrimistre = numeroTrimistre;
    }

    public Taxe38Anuelle getTaxe38Anuelle() {
        return taxe38Anuelle;
    }

    public void setTaxe38Anuelle(Taxe38Anuelle taxe38Anuelle) {
        this.taxe38Anuelle = taxe38Anuelle;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public boolean isColturer() {
        return colturer;
    }

    public void setColturer(boolean colturer) {
        this.colturer = colturer;
    }

    public Long getNumeroBordure() {
        return numeroBordure;
    }

    public void setNumeroBordure(Long numeroBordure) {
        this.numeroBordure = numeroBordure;
    }

    public List<Taxe38TrimistrielleItem> getTaxe38TrimistrielleItems() {
        return taxe38TrimistrielleItems;
    }

    public void setTaxe38TrimistrielleItems(List<Taxe38TrimistrielleItem> taxe38TrimistrielleItems) {
        this.taxe38TrimistrielleItems = taxe38TrimistrielleItems;
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
}
