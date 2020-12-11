package Héritage;

public class Article {

   private String nom;
   private double prix;

    void afficher(){
        System.out.println(nom + prix +"MAD");

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
}

