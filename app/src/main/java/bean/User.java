package bean;

/**
 * Created by ammach on 7/22/2016.
 */
public class User {

    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int blocked;
    private int nbrCnx;


    //    private boolean creationTarificationRetardTaxeBoison = true;
//    private boolean consultationTarificationRetardTaxeBoison = true;
//
//    private boolean creationTaxeBoisonTrimistrielle = true;
//    private boolean consultationTaxeBoisonTrimistrielle = true;

    private boolean creationRedevable = true;      //0
    private boolean creationActivite = true;      //1
    private boolean creationSecteure = true;      //2
    private boolean creationUser = true;    //3

    private boolean taxeBoison = true;      //4
    private boolean cloturerBoison = true;   //6

    private boolean taxeSejour = true;  //7
    private boolean cloturerSejour = true;   //9

    private boolean taxe38 = true;  //10
    private boolean cloturer38 = true;   //12

    private boolean taxe37 = true;  //13
    private boolean cloturer37 = true;   //15

    private boolean taxeTnb = true;  //16
    private boolean cloturerTnb = true;   //18

    private boolean taux=true;

    private Commune commune;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int getNbrCnx() {
        return nbrCnx;
    }

    public void setNbrCnx(int nbrCnx) {
        this.nbrCnx = nbrCnx;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
