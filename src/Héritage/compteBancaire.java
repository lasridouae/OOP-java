    package Héritage;

    public class compteBancaire {

    private long numCompte;
    private double solde;

     public double Ajouter(double ajout){
return solde+ ajout;
     }
    public double Retirer(double retir){
return solde-retir;
    }



    public void Afficher() {
         System.out.println("les caractéristiques d’un compte"+numCompte);
    }

    }
