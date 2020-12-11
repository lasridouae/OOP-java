package Polymorphisme;


public class Directeur extends Chef{
     String societe;

    public Directeur(String nom, String prénom, String adresse, String ville, int dateNaissance, double salaire, String service,String societe) {
        super(nom, prénom, adresse, ville, dateNaissance, salaire, service);
        this.societe=societe;
    }


    @Override
    public void Affiche() {
        System.out.println("le champ est : " +societe);
        super.Affiche();
    }
}
