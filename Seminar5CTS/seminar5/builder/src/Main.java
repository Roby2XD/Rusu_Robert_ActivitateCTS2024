import builder.classes.Pacient;
import builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new PacientBuilder().setPatRabatabil(true)
                .setHalatPentruInterior(true)
                .setPatRabatabil(true)
                .setPapuciDeCamera(true)
                .setMicDeJunInclus(true)
                .build();

        Pacient pacient2 = new PacientBuilder()
                .setPatRabatabil(true)
                .build();


        System.out.println(pacient);
        System.out.println(pacient2);

        builder_v3.Pacient.PacientBuilder pacientBuilder = new builder_v3.Pacient.PacientBuilder();
        builder_v3.Pacient pacient3 = pacientBuilder
                .setPatRabatabil(true)
                .setMicDejun(true)
                .setHalatDeInterior(true)
                .setPapuciDeCamera(true)
                .build();

        System.out.println(pacient3);
    }

}