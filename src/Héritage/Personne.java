package Héritage;

public class Personne {
    String nom;
    String prenom;
    double dateNaissance;
    String adresse;
    String ville;

    public Personne(String nom, String prenom, double dateNaissance, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }

    public void modifierpersonne() {
        this.adresse = adresse;
        this.ville = ville;
    }


            public abstract class ecrirePersonne{

                    public ecrirePersonne(String nom, String prenom, double dateNaissance, String adresse, String ville){
                        nom = "douae";
                        prenom ="lasri";
                        dateNaissance=1995;
                        adresse="hay mohemmadi";
                        ville= "youssoufia";

                    }

                }
   }
