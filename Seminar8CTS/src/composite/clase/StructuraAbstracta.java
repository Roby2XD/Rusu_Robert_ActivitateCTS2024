package composite.clase;

public abstract class StructuraAbstracta {
    private String nume;

    public StructuraAbstracta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugaStructura(StructuraAbstracta sa);
    public abstract void stergeStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);

    public abstract void afiseazaDescriere(String identare);
}
