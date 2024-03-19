package builder.classes;

public class PacientBuilder implements Builder{

    Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient(false, false, false, false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDeJunInclus(boolean micDeJunInclus) {
        this.pacient.setMicDeJunInclus(micDeJunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    public Pacient build() {
        return pacient;
    }
}
