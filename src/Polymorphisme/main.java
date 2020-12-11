package Polymorphisme;

public class main {
    public static void main(String[] args){
        Personne P1 = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P2 = new Personne ("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P3 = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P4 = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P5 = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P6  = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P7 = new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);
        Personne P8= new Personne("douae","lasri","hay el mohemmadi","Youssoufia",1995);

        Personne em1 = new Employe("douae","lasri","hay el mohemmadi","Youssoufia",1995,4300);
        Personne em2 = new Employe("douae","lasri","hay el mohemmadi","Youssoufia",1995,4300);
        Personne em3 = new Employe("douae","lasri","hay el mohemmadi","Youssoufia",1995,4300);
        Personne em4 = new Employe("douae","lasri","hay el mohemmadi","Youssoufia",1995,4300);
        Personne em5 = new Employe("douae","lasri","hay el mohemmadi","Youssoufia",1995,4300);

        Personne chef1 = new Chef("amine","kha","massira1","marrakech",1984, 21000, "medecin");
        Personne chef2 = new Chef("amine","kha","massira1","marrakech",1984, 21000, "medecin");
        Personne seo = new Directeur("douae", "lasri","Hay el mohammadi" , "Youssoufia", 1995, 45676, "developement", "CupOfJava");
P1.Affiche();
em1.Affiche();
    }
}
