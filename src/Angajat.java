import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat {

    private String nume;
    private String codAngajat;
    private List<iAngajat> subordonati;

    public Angajat(String nume, String codAngajat) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.subordonati = new ArrayList<>();
    }


    @Override
    public void afisareDetalii() {
        System.out.println(nume + " " + codAngajat);

        if(this.subordonati.isEmpty()){

            System.out.println("Angajatul nu are subordonati");
        }
        else{
            for (iAngajat a : this.subordonati) {
                System.out.println(a);
            }
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", codAngajat='").append(codAngajat).append('\'');
        sb.append(", subordonati=").append(subordonati);
        sb.append('}');
        return sb.toString();
    }

    public void adaugaSubordonat(iAngajat angajat){
        subordonati.add(angajat);
    }

    public void stergeSubordonat(iAngajat angajat){
        subordonati.remove(angajat);
    }


}
