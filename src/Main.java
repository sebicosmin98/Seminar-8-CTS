import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

                                                                // Composite

    public static void main(String[] args){

        Angajat angajatNormal1 = new Angajat("Andrei","0");
        Angajat angajatNormal2 = new Angajat("Dragos", "0");
        Angajat angajatNormal3 = new Angajat("Cristian","0");
        Angajat angajatNormal4 = new Angajat("Iulian", "0");


        Angajat manager1 = new Angajat("Sebi","1");
        manager1.adaugaSubordonat(angajatNormal1);
        manager1.adaugaSubordonat(angajatNormal2);

        Angajat manager2 = new Angajat("Nicusor","1");
        manager2.adaugaSubordonat(angajatNormal3);
        manager2.adaugaSubordonat(angajatNormal4);

        Angajat CEO = new Angajat("Alexandru", "2");
        CEO.adaugaSubordonat(manager1);
        CEO.adaugaSubordonat(manager2);

        angajatNormal1.afisareDetalii();

        manager1.afisareDetalii();

        manager2.afisareDetalii();

        CEO.afisareDetalii();


    }
}
