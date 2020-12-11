package Héritage;

public class Étudiant extends Personne{
    private String diplôme;

    public Étudiant(String nom, String prenom, double dateNaissance, String adresse, String ville, String diplôme) {
        super(nom, prenom, dateNaissance, adresse, ville);
        this.diplôme = diplôme;
    }

    @Override
    public String toString() {
        return "Étudiant{" +
                "diplôme='" + diplôme + '\'' +
                '}';
    }
}
