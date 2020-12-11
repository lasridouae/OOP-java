package Constructeur;

public class Employe {
    String nom;
    String prenom;
    String adress;
    int anneeNaissance;
    int anneeEncours ;

    public  int calculerAge() {
        return   anneeEncours  - anneeNaissance;

    }


    public void afficherInfosClient() {
        System.out.println(nom + prenom + "habite a "+adress + calculerAge() +"ans");
    }

    public Employe(String nom, String prenom, String adress, int anneeNaissance, int anneeEncours) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.anneeNaissance = anneeNaissance;
        this.anneeEncours = anneeEncours;
    }
}
