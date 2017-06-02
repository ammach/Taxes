package bean;

import java.util.Date;
import java.util.List;

/**
 * Created by ammach on 7/22/2016.
 */
public class Redevable {

    private String login;
    private String password;
    private String cin;
    private String telephone;
    private String patente;
    private String nomCommerciale;

    private Activite activite;
    private String fax;
    private String nom;
    private String prenom;
    private String email;
    private boolean comptable;
    private int entite; //0==>Personne Physique;1==>Societe Physique;2==>Societe Morale
    private String rc;
    private String raisonSocial;
    private String adresse;
    private boolean chaumage;

    private int type;
    private int nbrCommercial;
    private int nbrProfessionelle;
    private int nbrIndustrielle;
    private int nbrCiosqueTel;
    private int nbrCiosqueCommercial;
    private int nbrPepinaire;
    private int nbrPanneauPub;
    private int nbrPanneauPubAvec;
    private int nbrPanneauMural;
    private int nbrPoteau;
    private int nbrToteme;
    private int nbrTroutoire;

    private Date dateChaumage;
    private int natureExploitant;// 0: gerant 1:proprietaire 2:directeur

    private Date dateDemarrageActivite;

    private User user;

    private Date dateSystem = new Date();

    private List<TaxeSejourAnuelle> taxeSejourAnuelles;

    private List<TaxeBoisonAnuelle> taxeBoisonAnuelles;

    private List<Locale> locales;


    public Redevable(String cin) {
        this.cin = cin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNomCommerciale() {
        return nomCommerciale;
    }

    public void setNomCommerciale(String nomCommerciale) {
        this.nomCommerciale = nomCommerciale;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isComptable() {
        return comptable;
    }

    public void setComptable(boolean comptable) {
        this.comptable = comptable;
    }

    public int getEntite() {
        return entite;
    }

    public void setEntite(int entite) {
        this.entite = entite;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isChaumage() {
        return chaumage;
    }

    public void setChaumage(boolean chaumage) {
        this.chaumage = chaumage;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNbrCommercial() {
        return nbrCommercial;
    }

    public void setNbrCommercial(int nbrCommercial) {
        this.nbrCommercial = nbrCommercial;
    }

    public int getNbrProfessionelle() {
        return nbrProfessionelle;
    }

    public void setNbrProfessionelle(int nbrProfessionelle) {
        this.nbrProfessionelle = nbrProfessionelle;
    }

    public int getNbrIndustrielle() {
        return nbrIndustrielle;
    }

    public void setNbrIndustrielle(int nbrIndustrielle) {
        this.nbrIndustrielle = nbrIndustrielle;
    }

    public int getNbrCiosqueTel() {
        return nbrCiosqueTel;
    }

    public void setNbrCiosqueTel(int nbrCiosqueTel) {
        this.nbrCiosqueTel = nbrCiosqueTel;
    }

    public int getNbrCiosqueCommercial() {
        return nbrCiosqueCommercial;
    }

    public void setNbrCiosqueCommercial(int nbrCiosqueCommercial) {
        this.nbrCiosqueCommercial = nbrCiosqueCommercial;
    }

    public int getNbrPepinaire() {
        return nbrPepinaire;
    }

    public void setNbrPepinaire(int nbrPepinaire) {
        this.nbrPepinaire = nbrPepinaire;
    }

    public int getNbrPanneauPub() {
        return nbrPanneauPub;
    }

    public void setNbrPanneauPub(int nbrPanneauPub) {
        this.nbrPanneauPub = nbrPanneauPub;
    }

    public int getNbrPanneauPubAvec() {
        return nbrPanneauPubAvec;
    }

    public void setNbrPanneauPubAvec(int nbrPanneauPubAvec) {
        this.nbrPanneauPubAvec = nbrPanneauPubAvec;
    }

    public int getNbrPanneauMural() {
        return nbrPanneauMural;
    }

    public void setNbrPanneauMural(int nbrPanneauMural) {
        this.nbrPanneauMural = nbrPanneauMural;
    }

    public int getNbrPoteau() {
        return nbrPoteau;
    }

    public void setNbrPoteau(int nbrPoteau) {
        this.nbrPoteau = nbrPoteau;
    }

    public int getNbrToteme() {
        return nbrToteme;
    }

    public void setNbrToteme(int nbrToteme) {
        this.nbrToteme = nbrToteme;
    }

    public int getNbrTroutoire() {
        return nbrTroutoire;
    }

    public void setNbrTroutoire(int nbrTroutoire) {
        this.nbrTroutoire = nbrTroutoire;
    }

    public Date getDateChaumage() {
        return dateChaumage;
    }

    public void setDateChaumage(Date dateChaumage) {
        this.dateChaumage = dateChaumage;
    }

    public int getNatureExploitant() {
        return natureExploitant;
    }

    public void setNatureExploitant(int natureExploitant) {
        this.natureExploitant = natureExploitant;
    }

    public Date getDateDemarrageActivite() {
        return dateDemarrageActivite;
    }

    public void setDateDemarrageActivite(Date dateDemarrageActivite) {
        this.dateDemarrageActivite = dateDemarrageActivite;
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

    public List<TaxeSejourAnuelle> getTaxeSejourAnuelles() {
        return taxeSejourAnuelles;
    }

    public void setTaxeSejourAnuelles(List<TaxeSejourAnuelle> taxeSejourAnuelles) {
        this.taxeSejourAnuelles = taxeSejourAnuelles;
    }

    public List<TaxeBoisonAnuelle> getTaxeBoisonAnuelles() {
        return taxeBoisonAnuelles;
    }

    public void setTaxeBoisonAnuelles(List<TaxeBoisonAnuelle> taxeBoisonAnuelles) {
        this.taxeBoisonAnuelles = taxeBoisonAnuelles;
    }

    public List<Locale> getLocales() {
        return locales;
    }

    public void setLocales(List<Locale> locales) {
        this.locales = locales;
    }
}
