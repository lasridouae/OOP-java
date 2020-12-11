package Héritage;

public class ArticleEnSolde extends Article{

   private double réduction;

    public ArticleEnSolde(String nom, double prix) {
        super(nom, prix);
    }


    double calculReduction (){
         return getPrix()-(getPrix()*réduction/100);


    }

    public double getRéduction() {
        return réduction;
    }

    public ArticleEnSolde setRéduction(double réduction) {
        this.réduction = réduction;
        return this;
    }

    public void afficher() {

        System.out.println("reduced price is  : " + calculReduction() + " MAD");
    }

    public static void main(String[] args) {
        ArticleEnSolde test = new ArticleEnSolde("lasri douae",778);
        test.setRéduction(10);
        test.afficher();
    }


}
