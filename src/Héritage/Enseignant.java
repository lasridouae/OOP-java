package Héritage;

public class Enseignant extends Personne {
private String spécialité;

    public Enseignant(String nom, String prenom, double dateNaissance, String adresse, String ville, String spécialité) {
        super(nom, prenom, dateNaissance, adresse, ville);
        this.spécialité = spécialité;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "spécialité='" + spécialité + '\'' +
                '}';
    }
}
