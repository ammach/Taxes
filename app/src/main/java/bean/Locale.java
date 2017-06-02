package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Locale {

    private Long id;
    private String idtc;
    private String adresse;
    private Zone zone;

    private Double totalTaxeBoisson;
    private Double totalRetardTaxeBoisson;
    private BigDecimal totalTaxe38;
    private BigDecimal totalRetardTaxe38;
    private BigDecimal totalTaxeTnb;
    private BigDecimal totalRetardTaxeTnb;
    private BigDecimal montantTotalBoisonDu;
    private BigDecimal montantTotalBoisonRetard;
    private BigDecimal montantTotalSejourDu;
    private BigDecimal montantTotalSejourRetard;
    private BigDecimal montantTotalTaxe38Du;
    private BigDecimal montantTotalTaxeTnbDu;
    private BigDecimal montantTotalTaxeTnb;
    private BigDecimal montantTotalTaxe38Retard;
    private BigDecimal montantTotalTaxeTnbRetard;

    //37
    private BigDecimal metrageCommercial; // val / -1
    private BigDecimal metrageProfessionelle;
    private BigDecimal metrageIndistruel;
    private int ciosqueTel;
    private int ciosqueCommercial;
    private BigDecimal metrageStationGazoil;
    private BigDecimal metragePepinaire;
    private BigDecimal metragePanneauElectrique;
    private BigDecimal metragePanneauLumineuxBouge;
    private BigDecimal metragePanneauLumineuxFix;
    private BigDecimal metragePanneauMural;
    private int poteau; // 0 / 1
    private BigDecimal metrageToteme;
    private BigDecimal metrageTroutoire;

    private int anneeDernierPaiementTaxBoison; // jamais paye ==> -1 deja pay ==> >0  n apppartien pas a cette cat ==> -2
    private int trimestreDernierPaiementTaxBoison;
    private int anneeDernierPaiementTaxSejour;
    private int trimestreDernierPaiementTaxSejour;
    private int anneeDernierPaiementTax36;
    private int trimestreDernierPaiementTax36;
    private int anneeDernierPaiementTax38;
    private int anneeDernierPaiementTaxTnb;
    private int trimestreDernierPaiementTax38;

    private int anneeDernierPaiementCommercial;
    private int trimestreDernierPaiementCommercial;
    private int anneeDernierPaiementProfessionelle;
    private int trimestreDernierPaiementProfessionelle;
    private int anneeDernierPaiementIndistruel;
    private int trimestreDernierPaiementIndistruel;
    private int anneeDernierPaiementCiosqueTel;
    private int trimestreDernierPaiementCiosqueTel;
    private int anneeDernierPaiementCiosqueCommercial;
    private int trimestreDernierPaiementCiosqueCommercial;
    private int anneeDernierPaiementStation;
    private int trimestreDernierPaiementStation;
    private int anneeDernierPaiementPepinaire;
    private int trimestreDernierPaiementPepinaire;
    private int anneeDernierPaiementPanneauElectrique;
    private int trimestreDernierPaiementPanneauElectrique;
    private int anneeDernierPaiementPanneauLumineuxFix;
    private int trimestreDernierPaiementPanneauLumineuxBouge;
    private int anneeDernierPaiementPanneauLumineuxBouge;
    private int trimestreDernierPaiementPanneauLumineuxFix;
    private int anneeDernierPaiementPanneauMural;
    private int trimestreDernierPaiementPanneauMural;
    private int anneeDernierPaiementPoteau;
    private int trimestreDernierPaiementPoteau;
    private int anneeDernierPaiementToteme;
    private int trimestreDernierPaiementToteme;
    private int anneeDernierPaiementTroutoire;
    private int trimestreDernierPaiementTroutoire;
    //37
    private int dernierAnneePaiementAnnuelleTaxeBoisson;
    private int dernierAnneePaiementAnnuelleTaxeTnb;
    private int dernierAnneePaiementAnnuelleTaxeSejour;
    private int dernierAnneePaiementAnnuelleTaxe38;
    private int dernierAnneePaiementAnnuelleTaxe37;

    private BigDecimal dernierPaiementBoisson;
    private BigDecimal dernierPaiementSejour;
    private BigDecimal dernierPaiementTnb;
    private BigDecimal dernierPaiement38;
    private BigDecimal dernierPaiement37;

    private int taxeType;

    private CategorieSejour categorieSejour;

    private Categorie37 categorie37;

    private User user;

    private Date dateSystem = new Date();

    private BigDecimal valeurLocation;

    private CategorieHabitation categorieHabitation;
    private BigDecimal surface;

    private Redevable redevable;

    private Rue rue;

    private Activite activite ;

    private List<TaxeBoisonAnuelle> taxeBoisonAnulles;

    private List<TaxeSejourAnuelle> taxeSejourAnuelles;

    private List<Taxe38Anuelle> taxe38Anuelles;

    private List<Locale38Item> locale38Items;

    private InfoNotification infoNotification ;


    public Locale(String adresse, Rue rue) {
        this.adresse = adresse;
        this.rue = rue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdtc() {
        return idtc;
    }

    public void setIdtc(String idtc) {
        this.idtc = idtc;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Double getTotalTaxeBoisson() {
        return totalTaxeBoisson;
    }

    public void setTotalTaxeBoisson(Double totalTaxeBoisson) {
        this.totalTaxeBoisson = totalTaxeBoisson;
    }

    public Double getTotalRetardTaxeBoisson() {
        return totalRetardTaxeBoisson;
    }

    public void setTotalRetardTaxeBoisson(Double totalRetardTaxeBoisson) {
        this.totalRetardTaxeBoisson = totalRetardTaxeBoisson;
    }

    public BigDecimal getTotalTaxe38() {
        return totalTaxe38;
    }

    public void setTotalTaxe38(BigDecimal totalTaxe38) {
        this.totalTaxe38 = totalTaxe38;
    }

    public BigDecimal getTotalRetardTaxe38() {
        return totalRetardTaxe38;
    }

    public void setTotalRetardTaxe38(BigDecimal totalRetardTaxe38) {
        this.totalRetardTaxe38 = totalRetardTaxe38;
    }

    public BigDecimal getTotalTaxeTnb() {
        return totalTaxeTnb;
    }

    public void setTotalTaxeTnb(BigDecimal totalTaxeTnb) {
        this.totalTaxeTnb = totalTaxeTnb;
    }

    public BigDecimal getTotalRetardTaxeTnb() {
        return totalRetardTaxeTnb;
    }

    public void setTotalRetardTaxeTnb(BigDecimal totalRetardTaxeTnb) {
        this.totalRetardTaxeTnb = totalRetardTaxeTnb;
    }

    public BigDecimal getMontantTotalBoisonDu() {
        return montantTotalBoisonDu;
    }

    public void setMontantTotalBoisonDu(BigDecimal montantTotalBoisonDu) {
        this.montantTotalBoisonDu = montantTotalBoisonDu;
    }

    public BigDecimal getMontantTotalBoisonRetard() {
        return montantTotalBoisonRetard;
    }

    public void setMontantTotalBoisonRetard(BigDecimal montantTotalBoisonRetard) {
        this.montantTotalBoisonRetard = montantTotalBoisonRetard;
    }

    public BigDecimal getMontantTotalSejourDu() {
        return montantTotalSejourDu;
    }

    public void setMontantTotalSejourDu(BigDecimal montantTotalSejourDu) {
        this.montantTotalSejourDu = montantTotalSejourDu;
    }

    public BigDecimal getMontantTotalSejourRetard() {
        return montantTotalSejourRetard;
    }

    public void setMontantTotalSejourRetard(BigDecimal montantTotalSejourRetard) {
        this.montantTotalSejourRetard = montantTotalSejourRetard;
    }

    public BigDecimal getMontantTotalTaxe38Du() {
        return montantTotalTaxe38Du;
    }

    public void setMontantTotalTaxe38Du(BigDecimal montantTotalTaxe38Du) {
        this.montantTotalTaxe38Du = montantTotalTaxe38Du;
    }

    public BigDecimal getMontantTotalTaxeTnbDu() {
        return montantTotalTaxeTnbDu;
    }

    public void setMontantTotalTaxeTnbDu(BigDecimal montantTotalTaxeTnbDu) {
        this.montantTotalTaxeTnbDu = montantTotalTaxeTnbDu;
    }

    public BigDecimal getMontantTotalTaxeTnb() {
        return montantTotalTaxeTnb;
    }

    public void setMontantTotalTaxeTnb(BigDecimal montantTotalTaxeTnb) {
        this.montantTotalTaxeTnb = montantTotalTaxeTnb;
    }

    public BigDecimal getMontantTotalTaxe38Retard() {
        return montantTotalTaxe38Retard;
    }

    public void setMontantTotalTaxe38Retard(BigDecimal montantTotalTaxe38Retard) {
        this.montantTotalTaxe38Retard = montantTotalTaxe38Retard;
    }

    public BigDecimal getMontantTotalTaxeTnbRetard() {
        return montantTotalTaxeTnbRetard;
    }

    public void setMontantTotalTaxeTnbRetard(BigDecimal montantTotalTaxeTnbRetard) {
        this.montantTotalTaxeTnbRetard = montantTotalTaxeTnbRetard;
    }

    public BigDecimal getMetrageCommercial() {
        return metrageCommercial;
    }

    public void setMetrageCommercial(BigDecimal metrageCommercial) {
        this.metrageCommercial = metrageCommercial;
    }

    public BigDecimal getMetrageProfessionelle() {
        return metrageProfessionelle;
    }

    public void setMetrageProfessionelle(BigDecimal metrageProfessionelle) {
        this.metrageProfessionelle = metrageProfessionelle;
    }

    public BigDecimal getMetrageIndistruel() {
        return metrageIndistruel;
    }

    public void setMetrageIndistruel(BigDecimal metrageIndistruel) {
        this.metrageIndistruel = metrageIndistruel;
    }

    public int getCiosqueTel() {
        return ciosqueTel;
    }

    public void setCiosqueTel(int ciosqueTel) {
        this.ciosqueTel = ciosqueTel;
    }

    public int getCiosqueCommercial() {
        return ciosqueCommercial;
    }

    public void setCiosqueCommercial(int ciosqueCommercial) {
        this.ciosqueCommercial = ciosqueCommercial;
    }

    public BigDecimal getMetrageStationGazoil() {
        return metrageStationGazoil;
    }

    public void setMetrageStationGazoil(BigDecimal metrageStationGazoil) {
        this.metrageStationGazoil = metrageStationGazoil;
    }

    public BigDecimal getMetragePepinaire() {
        return metragePepinaire;
    }

    public void setMetragePepinaire(BigDecimal metragePepinaire) {
        this.metragePepinaire = metragePepinaire;
    }

    public BigDecimal getMetragePanneauElectrique() {
        return metragePanneauElectrique;
    }

    public void setMetragePanneauElectrique(BigDecimal metragePanneauElectrique) {
        this.metragePanneauElectrique = metragePanneauElectrique;
    }

    public BigDecimal getMetragePanneauLumineuxBouge() {
        return metragePanneauLumineuxBouge;
    }

    public void setMetragePanneauLumineuxBouge(BigDecimal metragePanneauLumineuxBouge) {
        this.metragePanneauLumineuxBouge = metragePanneauLumineuxBouge;
    }

    public BigDecimal getMetragePanneauLumineuxFix() {
        return metragePanneauLumineuxFix;
    }

    public void setMetragePanneauLumineuxFix(BigDecimal metragePanneauLumineuxFix) {
        this.metragePanneauLumineuxFix = metragePanneauLumineuxFix;
    }

    public BigDecimal getMetragePanneauMural() {
        return metragePanneauMural;
    }

    public void setMetragePanneauMural(BigDecimal metragePanneauMural) {
        this.metragePanneauMural = metragePanneauMural;
    }

    public int getPoteau() {
        return poteau;
    }

    public void setPoteau(int poteau) {
        this.poteau = poteau;
    }

    public BigDecimal getMetrageToteme() {
        return metrageToteme;
    }

    public void setMetrageToteme(BigDecimal metrageToteme) {
        this.metrageToteme = metrageToteme;
    }

    public BigDecimal getMetrageTroutoire() {
        return metrageTroutoire;
    }

    public void setMetrageTroutoire(BigDecimal metrageTroutoire) {
        this.metrageTroutoire = metrageTroutoire;
    }

    public int getAnneeDernierPaiementTaxBoison() {
        return anneeDernierPaiementTaxBoison;
    }

    public void setAnneeDernierPaiementTaxBoison(int anneeDernierPaiementTaxBoison) {
        this.anneeDernierPaiementTaxBoison = anneeDernierPaiementTaxBoison;
    }

    public int getTrimestreDernierPaiementTaxBoison() {
        return trimestreDernierPaiementTaxBoison;
    }

    public void setTrimestreDernierPaiementTaxBoison(int trimestreDernierPaiementTaxBoison) {
        this.trimestreDernierPaiementTaxBoison = trimestreDernierPaiementTaxBoison;
    }

    public int getAnneeDernierPaiementTaxSejour() {
        return anneeDernierPaiementTaxSejour;
    }

    public void setAnneeDernierPaiementTaxSejour(int anneeDernierPaiementTaxSejour) {
        this.anneeDernierPaiementTaxSejour = anneeDernierPaiementTaxSejour;
    }

    public int getTrimestreDernierPaiementTaxSejour() {
        return trimestreDernierPaiementTaxSejour;
    }

    public void setTrimestreDernierPaiementTaxSejour(int trimestreDernierPaiementTaxSejour) {
        this.trimestreDernierPaiementTaxSejour = trimestreDernierPaiementTaxSejour;
    }

    public int getAnneeDernierPaiementTax36() {
        return anneeDernierPaiementTax36;
    }

    public void setAnneeDernierPaiementTax36(int anneeDernierPaiementTax36) {
        this.anneeDernierPaiementTax36 = anneeDernierPaiementTax36;
    }

    public int getTrimestreDernierPaiementTax36() {
        return trimestreDernierPaiementTax36;
    }

    public void setTrimestreDernierPaiementTax36(int trimestreDernierPaiementTax36) {
        this.trimestreDernierPaiementTax36 = trimestreDernierPaiementTax36;
    }

    public int getAnneeDernierPaiementTax38() {
        return anneeDernierPaiementTax38;
    }

    public void setAnneeDernierPaiementTax38(int anneeDernierPaiementTax38) {
        this.anneeDernierPaiementTax38 = anneeDernierPaiementTax38;
    }

    public int getAnneeDernierPaiementTaxTnb() {
        return anneeDernierPaiementTaxTnb;
    }

    public void setAnneeDernierPaiementTaxTnb(int anneeDernierPaiementTaxTnb) {
        this.anneeDernierPaiementTaxTnb = anneeDernierPaiementTaxTnb;
    }

    public int getTrimestreDernierPaiementTax38() {
        return trimestreDernierPaiementTax38;
    }

    public void setTrimestreDernierPaiementTax38(int trimestreDernierPaiementTax38) {
        this.trimestreDernierPaiementTax38 = trimestreDernierPaiementTax38;
    }

    public int getAnneeDernierPaiementCommercial() {
        return anneeDernierPaiementCommercial;
    }

    public void setAnneeDernierPaiementCommercial(int anneeDernierPaiementCommercial) {
        this.anneeDernierPaiementCommercial = anneeDernierPaiementCommercial;
    }

    public int getTrimestreDernierPaiementCommercial() {
        return trimestreDernierPaiementCommercial;
    }

    public void setTrimestreDernierPaiementCommercial(int trimestreDernierPaiementCommercial) {
        this.trimestreDernierPaiementCommercial = trimestreDernierPaiementCommercial;
    }

    public int getAnneeDernierPaiementProfessionelle() {
        return anneeDernierPaiementProfessionelle;
    }

    public void setAnneeDernierPaiementProfessionelle(int anneeDernierPaiementProfessionelle) {
        this.anneeDernierPaiementProfessionelle = anneeDernierPaiementProfessionelle;
    }

    public int getTrimestreDernierPaiementProfessionelle() {
        return trimestreDernierPaiementProfessionelle;
    }

    public void setTrimestreDernierPaiementProfessionelle(int trimestreDernierPaiementProfessionelle) {
        this.trimestreDernierPaiementProfessionelle = trimestreDernierPaiementProfessionelle;
    }

    public int getAnneeDernierPaiementIndistruel() {
        return anneeDernierPaiementIndistruel;
    }

    public void setAnneeDernierPaiementIndistruel(int anneeDernierPaiementIndistruel) {
        this.anneeDernierPaiementIndistruel = anneeDernierPaiementIndistruel;
    }

    public int getTrimestreDernierPaiementIndistruel() {
        return trimestreDernierPaiementIndistruel;
    }

    public void setTrimestreDernierPaiementIndistruel(int trimestreDernierPaiementIndistruel) {
        this.trimestreDernierPaiementIndistruel = trimestreDernierPaiementIndistruel;
    }

    public int getAnneeDernierPaiementCiosqueTel() {
        return anneeDernierPaiementCiosqueTel;
    }

    public void setAnneeDernierPaiementCiosqueTel(int anneeDernierPaiementCiosqueTel) {
        this.anneeDernierPaiementCiosqueTel = anneeDernierPaiementCiosqueTel;
    }

    public int getTrimestreDernierPaiementCiosqueTel() {
        return trimestreDernierPaiementCiosqueTel;
    }

    public void setTrimestreDernierPaiementCiosqueTel(int trimestreDernierPaiementCiosqueTel) {
        this.trimestreDernierPaiementCiosqueTel = trimestreDernierPaiementCiosqueTel;
    }

    public int getAnneeDernierPaiementCiosqueCommercial() {
        return anneeDernierPaiementCiosqueCommercial;
    }

    public void setAnneeDernierPaiementCiosqueCommercial(int anneeDernierPaiementCiosqueCommercial) {
        this.anneeDernierPaiementCiosqueCommercial = anneeDernierPaiementCiosqueCommercial;
    }

    public int getTrimestreDernierPaiementCiosqueCommercial() {
        return trimestreDernierPaiementCiosqueCommercial;
    }

    public void setTrimestreDernierPaiementCiosqueCommercial(int trimestreDernierPaiementCiosqueCommercial) {
        this.trimestreDernierPaiementCiosqueCommercial = trimestreDernierPaiementCiosqueCommercial;
    }

    public int getAnneeDernierPaiementStation() {
        return anneeDernierPaiementStation;
    }

    public void setAnneeDernierPaiementStation(int anneeDernierPaiementStation) {
        this.anneeDernierPaiementStation = anneeDernierPaiementStation;
    }

    public int getTrimestreDernierPaiementStation() {
        return trimestreDernierPaiementStation;
    }

    public void setTrimestreDernierPaiementStation(int trimestreDernierPaiementStation) {
        this.trimestreDernierPaiementStation = trimestreDernierPaiementStation;
    }

    public int getAnneeDernierPaiementPepinaire() {
        return anneeDernierPaiementPepinaire;
    }

    public void setAnneeDernierPaiementPepinaire(int anneeDernierPaiementPepinaire) {
        this.anneeDernierPaiementPepinaire = anneeDernierPaiementPepinaire;
    }

    public int getTrimestreDernierPaiementPepinaire() {
        return trimestreDernierPaiementPepinaire;
    }

    public void setTrimestreDernierPaiementPepinaire(int trimestreDernierPaiementPepinaire) {
        this.trimestreDernierPaiementPepinaire = trimestreDernierPaiementPepinaire;
    }

    public int getAnneeDernierPaiementPanneauElectrique() {
        return anneeDernierPaiementPanneauElectrique;
    }

    public void setAnneeDernierPaiementPanneauElectrique(int anneeDernierPaiementPanneauElectrique) {
        this.anneeDernierPaiementPanneauElectrique = anneeDernierPaiementPanneauElectrique;
    }

    public int getTrimestreDernierPaiementPanneauElectrique() {
        return trimestreDernierPaiementPanneauElectrique;
    }

    public void setTrimestreDernierPaiementPanneauElectrique(int trimestreDernierPaiementPanneauElectrique) {
        this.trimestreDernierPaiementPanneauElectrique = trimestreDernierPaiementPanneauElectrique;
    }

    public int getAnneeDernierPaiementPanneauLumineuxFix() {
        return anneeDernierPaiementPanneauLumineuxFix;
    }

    public void setAnneeDernierPaiementPanneauLumineuxFix(int anneeDernierPaiementPanneauLumineuxFix) {
        this.anneeDernierPaiementPanneauLumineuxFix = anneeDernierPaiementPanneauLumineuxFix;
    }

    public int getTrimestreDernierPaiementPanneauLumineuxBouge() {
        return trimestreDernierPaiementPanneauLumineuxBouge;
    }

    public void setTrimestreDernierPaiementPanneauLumineuxBouge(int trimestreDernierPaiementPanneauLumineuxBouge) {
        this.trimestreDernierPaiementPanneauLumineuxBouge = trimestreDernierPaiementPanneauLumineuxBouge;
    }

    public int getAnneeDernierPaiementPanneauLumineuxBouge() {
        return anneeDernierPaiementPanneauLumineuxBouge;
    }

    public void setAnneeDernierPaiementPanneauLumineuxBouge(int anneeDernierPaiementPanneauLumineuxBouge) {
        this.anneeDernierPaiementPanneauLumineuxBouge = anneeDernierPaiementPanneauLumineuxBouge;
    }

    public int getTrimestreDernierPaiementPanneauLumineuxFix() {
        return trimestreDernierPaiementPanneauLumineuxFix;
    }

    public void setTrimestreDernierPaiementPanneauLumineuxFix(int trimestreDernierPaiementPanneauLumineuxFix) {
        this.trimestreDernierPaiementPanneauLumineuxFix = trimestreDernierPaiementPanneauLumineuxFix;
    }

    public int getAnneeDernierPaiementPanneauMural() {
        return anneeDernierPaiementPanneauMural;
    }

    public void setAnneeDernierPaiementPanneauMural(int anneeDernierPaiementPanneauMural) {
        this.anneeDernierPaiementPanneauMural = anneeDernierPaiementPanneauMural;
    }

    public int getTrimestreDernierPaiementPanneauMural() {
        return trimestreDernierPaiementPanneauMural;
    }

    public void setTrimestreDernierPaiementPanneauMural(int trimestreDernierPaiementPanneauMural) {
        this.trimestreDernierPaiementPanneauMural = trimestreDernierPaiementPanneauMural;
    }

    public int getAnneeDernierPaiementPoteau() {
        return anneeDernierPaiementPoteau;
    }

    public void setAnneeDernierPaiementPoteau(int anneeDernierPaiementPoteau) {
        this.anneeDernierPaiementPoteau = anneeDernierPaiementPoteau;
    }

    public int getTrimestreDernierPaiementPoteau() {
        return trimestreDernierPaiementPoteau;
    }

    public void setTrimestreDernierPaiementPoteau(int trimestreDernierPaiementPoteau) {
        this.trimestreDernierPaiementPoteau = trimestreDernierPaiementPoteau;
    }

    public int getAnneeDernierPaiementToteme() {
        return anneeDernierPaiementToteme;
    }

    public void setAnneeDernierPaiementToteme(int anneeDernierPaiementToteme) {
        this.anneeDernierPaiementToteme = anneeDernierPaiementToteme;
    }

    public int getTrimestreDernierPaiementToteme() {
        return trimestreDernierPaiementToteme;
    }

    public void setTrimestreDernierPaiementToteme(int trimestreDernierPaiementToteme) {
        this.trimestreDernierPaiementToteme = trimestreDernierPaiementToteme;
    }

    public int getAnneeDernierPaiementTroutoire() {
        return anneeDernierPaiementTroutoire;
    }

    public void setAnneeDernierPaiementTroutoire(int anneeDernierPaiementTroutoire) {
        this.anneeDernierPaiementTroutoire = anneeDernierPaiementTroutoire;
    }

    public int getTrimestreDernierPaiementTroutoire() {
        return trimestreDernierPaiementTroutoire;
    }

    public void setTrimestreDernierPaiementTroutoire(int trimestreDernierPaiementTroutoire) {
        this.trimestreDernierPaiementTroutoire = trimestreDernierPaiementTroutoire;
    }

    public int getDernierAnneePaiementAnnuelleTaxeBoisson() {
        return dernierAnneePaiementAnnuelleTaxeBoisson;
    }

    public void setDernierAnneePaiementAnnuelleTaxeBoisson(int dernierAnneePaiementAnnuelleTaxeBoisson) {
        this.dernierAnneePaiementAnnuelleTaxeBoisson = dernierAnneePaiementAnnuelleTaxeBoisson;
    }

    public int getDernierAnneePaiementAnnuelleTaxeTnb() {
        return dernierAnneePaiementAnnuelleTaxeTnb;
    }

    public void setDernierAnneePaiementAnnuelleTaxeTnb(int dernierAnneePaiementAnnuelleTaxeTnb) {
        this.dernierAnneePaiementAnnuelleTaxeTnb = dernierAnneePaiementAnnuelleTaxeTnb;
    }

    public int getDernierAnneePaiementAnnuelleTaxeSejour() {
        return dernierAnneePaiementAnnuelleTaxeSejour;
    }

    public void setDernierAnneePaiementAnnuelleTaxeSejour(int dernierAnneePaiementAnnuelleTaxeSejour) {
        this.dernierAnneePaiementAnnuelleTaxeSejour = dernierAnneePaiementAnnuelleTaxeSejour;
    }

    public int getDernierAnneePaiementAnnuelleTaxe38() {
        return dernierAnneePaiementAnnuelleTaxe38;
    }

    public void setDernierAnneePaiementAnnuelleTaxe38(int dernierAnneePaiementAnnuelleTaxe38) {
        this.dernierAnneePaiementAnnuelleTaxe38 = dernierAnneePaiementAnnuelleTaxe38;
    }

    public int getDernierAnneePaiementAnnuelleTaxe37() {
        return dernierAnneePaiementAnnuelleTaxe37;
    }

    public void setDernierAnneePaiementAnnuelleTaxe37(int dernierAnneePaiementAnnuelleTaxe37) {
        this.dernierAnneePaiementAnnuelleTaxe37 = dernierAnneePaiementAnnuelleTaxe37;
    }

    public BigDecimal getDernierPaiementBoisson() {
        return dernierPaiementBoisson;
    }

    public void setDernierPaiementBoisson(BigDecimal dernierPaiementBoisson) {
        this.dernierPaiementBoisson = dernierPaiementBoisson;
    }

    public BigDecimal getDernierPaiementSejour() {
        return dernierPaiementSejour;
    }

    public void setDernierPaiementSejour(BigDecimal dernierPaiementSejour) {
        this.dernierPaiementSejour = dernierPaiementSejour;
    }

    public BigDecimal getDernierPaiementTnb() {
        return dernierPaiementTnb;
    }

    public void setDernierPaiementTnb(BigDecimal dernierPaiementTnb) {
        this.dernierPaiementTnb = dernierPaiementTnb;
    }

    public BigDecimal getDernierPaiement38() {
        return dernierPaiement38;
    }

    public void setDernierPaiement38(BigDecimal dernierPaiement38) {
        this.dernierPaiement38 = dernierPaiement38;
    }

    public BigDecimal getDernierPaiement37() {
        return dernierPaiement37;
    }

    public void setDernierPaiement37(BigDecimal dernierPaiement37) {
        this.dernierPaiement37 = dernierPaiement37;
    }

    public int getTaxeType() {
        return taxeType;
    }

    public void setTaxeType(int taxeType) {
        this.taxeType = taxeType;
    }

    public CategorieSejour getCategorieSejour() {
        return categorieSejour;
    }

    public void setCategorieSejour(CategorieSejour categorieSejour) {
        this.categorieSejour = categorieSejour;
    }

    public Categorie37 getCategorie37() {
        return categorie37;
    }

    public void setCategorie37(Categorie37 categorie37) {
        this.categorie37 = categorie37;
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

    public BigDecimal getValeurLocation() {
        return valeurLocation;
    }

    public void setValeurLocation(BigDecimal valeurLocation) {
        this.valeurLocation = valeurLocation;
    }

    public CategorieHabitation getCategorieHabitation() {
        return categorieHabitation;
    }

    public void setCategorieHabitation(CategorieHabitation categorieHabitation) {
        this.categorieHabitation = categorieHabitation;
    }

    public BigDecimal getSurface() {
        return surface;
    }

    public void setSurface(BigDecimal surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public List<TaxeBoisonAnuelle> getTaxeBoisonAnulles() {
        return taxeBoisonAnulles;
    }

    public void setTaxeBoisonAnulles(List<TaxeBoisonAnuelle> taxeBoisonAnulles) {
        this.taxeBoisonAnulles = taxeBoisonAnulles;
    }

    public List<TaxeSejourAnuelle> getTaxeSejourAnuelles() {
        return taxeSejourAnuelles;
    }

    public void setTaxeSejourAnuelles(List<TaxeSejourAnuelle> taxeSejourAnuelles) {
        this.taxeSejourAnuelles = taxeSejourAnuelles;
    }

    public List<Taxe38Anuelle> getTaxe38Anuelles() {
        return taxe38Anuelles;
    }

    public void setTaxe38Anuelles(List<Taxe38Anuelle> taxe38Anuelles) {
        this.taxe38Anuelles = taxe38Anuelles;
    }

    public List<Locale38Item> getLocale38Items() {
        return locale38Items;
    }

    public void setLocale38Items(List<Locale38Item> locale38Items) {
        this.locale38Items = locale38Items;
    }

    public InfoNotification getInfoNotification() {
        return infoNotification;
    }

    public void setInfoNotification(InfoNotification infoNotification) {
        this.infoNotification = infoNotification;
    }
}
