package Partea1.classes;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul "+getNume()+" este la spital");
    }
}
