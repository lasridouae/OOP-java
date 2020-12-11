package Polymorphisme;

import java.sql.SQLOutput;

public class Chef extends Employe {
    String service;

    public Chef(String nom, String prénom, String adresse, String ville, int dateNaissance, double salaire,String service) {
        super(nom, prénom, adresse, ville, dateNaissance, salaire);
        this.service = service;
    }

    @Override
    public void Affiche() {
        System.out.println("le service est : "+service );
        super.Affiche();
    }
}
