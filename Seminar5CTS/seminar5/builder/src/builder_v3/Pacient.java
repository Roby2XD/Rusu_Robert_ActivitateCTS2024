package builder_v3;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatPentruInterior=").append(halatPentruInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements Builder{
        private boolean patRabatabil;
        private boolean micDejun;
        private boolean papuciDeCamera;
        private boolean halatPentruInterior;

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil, micDejun, papuciDeCamera, halatPentruInterior);
        }
        public PacientBuilder setPatRabatabil(boolean patRabatabil){
            this.patRabatabil = patRabatabil;
            return this;
        }
        public PacientBuilder setMicDejun(boolean micDejun){
            this.micDejun = micDejun;
            return this;
        }
        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera){
            this.papuciDeCamera = papuciDeCamera;
            return this;
        }
        public PacientBuilder setHalatDeInterior(boolean halatPentruInterior){
            this.halatPentruInterior = halatPentruInterior;
            return this;
        }
    }
}