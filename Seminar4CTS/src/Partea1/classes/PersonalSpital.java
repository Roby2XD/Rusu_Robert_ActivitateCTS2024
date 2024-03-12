package Partea1.classes;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public abstract void afisareDetalii();


}
