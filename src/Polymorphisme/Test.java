package Polymorphisme;
import java.util.ArrayList;
public class Test {

        public static void main(String[] args) {

            ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();
            ArrayList<Abonne> abonnes=new ArrayList<Abonne>();


            Bibliotheque B1=new Bibliotheque("titre", "12/9/2020", false,ouvrages,abonnes);
            ouvrages.add(new Ouvrage("obj","ddd",false));
            ouvrages.add(new Ouvrage("obj","ddd",false));

            abonnes.add(new Abonne(1,"lasri",12));
            abonnes.add(new Abonne(2,"douae",12));


            B1.ajoutOuvrage(new Ouvrage("obj","date",false));
            B1.ajoutOuvrage(new Ouvrage("obj","date",false));
            B1.ajoutOuvrage(new Ouvrage("obj","date",false));
            System.out.println("ouvrages List : " +ouvrages);
            B1.afficher();
        }

    }

