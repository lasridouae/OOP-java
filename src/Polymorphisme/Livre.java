package Polymorphisme;

public class Livre extends Ouvrage{

    private String auteur;

    public Livre(String t, String date, boolean index,String auteur) {
        super(t, date, index);
        this.auteur=auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String aut) {
        this.auteur=aut;

    }
    public void afficher() {
        System.out.printf("le titre de ce ouvrage est :"+getTitre()," la date de creation est :"+getDate()+"  la disponibilité "+getIndex()+" l'auteur de livre +"+auteur);
    }


}

