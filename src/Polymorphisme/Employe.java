package Polymorphisme;

import java.sql.SQLOutput;

public class Employe extends Personne{
   double salaire;


    public Employe(String nom, String prénom, String adresse, String ville,int dateNaissance,double salaire) {
        super(nom, prénom, adresse, ville, dateNaissance);
        this.salaire = salaire;
    }

    @Override
    public void Affiche() {
        System.out.println("le salaire est : "+salaire + "MAD");
        super.Affiche();
    }
}
