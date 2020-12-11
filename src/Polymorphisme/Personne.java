package Polymorphisme;

public class Personne {
    String nom, prénom, adresse, ville ;
    double dateNaissance;

    public Personne(String nom, String prénom, String adresse, String ville, int dateNaissance) {
        this.nom = nom;
        this.prénom = prénom;
        this.adresse = adresse;
        this.ville = ville;
        this.dateNaissance = dateNaissance;
    }

    public void Affiche(){
       // System.out.println("le nom:"+nom+ "douaele prenom est :"+prénom+"lasri"+ville+"Youssoufia",adresse="hay el mohemmadi",dateNaissance=1995);
        System.out.println("le nom est:  "+nom);
        System.out.println("le prenom est : "+prénom);
        System.out.println("habitant a  " + adresse + ville );
        System.out.println("la date de naissance est : "+dateNaissance);
    }
}
