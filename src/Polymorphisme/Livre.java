package Polymorphisme;

public class Livre extends Ouvrage{
    String auteur;


    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println();
    }
}
