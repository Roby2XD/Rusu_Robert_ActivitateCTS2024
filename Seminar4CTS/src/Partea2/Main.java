package Partea2;

import Partea2.classes.Asistent;
import Partea2.classes.Medic;
import Partea2.classes.PersonalSpital;
import Partea2.classes.fabrica.*;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu){
        PersonalSpital personal = fabrica.createPersonal(nume, salariu);

        personal.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent= new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();

        PersonalSpital medic = fabricaMedic.createPersonal("pop", 3000);
        PersonalSpital asistent = fabricaAsistent.createPersonal("maria", 5000);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("asd",7878);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();


        prelucrarePersonal(new FabricaMedic(), "Buftea", 10000);

        prelucrarePersonal(new FabricaInfirmier(),"Ionut", 56000);



    }
}
