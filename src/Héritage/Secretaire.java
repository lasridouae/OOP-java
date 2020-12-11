package Héritage;

public class Secretaire extends Personne{

     private String numeroBureau;

    public Secretaire(String nom, String prenom, double dateNaissance, String adresse, String ville,String numeroBureau) {
        super(nom, prenom, dateNaissance, adresse, ville);
        this.numeroBureau=numeroBureau;
    }


    @Override
    public String toString() {
        return "Secretaire{" +
                "numeroBureau='" + numeroBureau + '\'' +
                '}';
    }
}
