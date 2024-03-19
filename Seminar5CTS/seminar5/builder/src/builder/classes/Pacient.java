package builder.classes;

public class Pacient {
    private boolean patRabatabil;

    private boolean micDeJunInclus;

    private boolean papuciDeCamera;

    private boolean halatPentruInterior;

    public Pacient(boolean patRabatabil, boolean micDeJunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDeJunInclus = micDeJunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDeJunInclus=" + micDeJunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }

     void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

     void setMicDeJunInclus(boolean micDeJunInclus) {
        this.micDeJunInclus = micDeJunInclus;
    }

     void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

     void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }
}
