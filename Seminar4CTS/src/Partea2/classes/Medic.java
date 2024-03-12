package Partea2.classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul "+getNume()+" este la spital");
    }
}
